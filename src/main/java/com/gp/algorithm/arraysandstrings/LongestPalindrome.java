package com.gp.algorithm.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/conm7/
 * 题目：最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * <p>
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * <p>
 * 解题思路：
 * 1. 设置 center 表示最长回文子串 中心字母center = s[i]（i= 1到 length-2）
 * 2. 判断 left = s[i-1] right = s[i+1] 是否相等，相等 i+2，以此类推。如果 s[i-1]!=s[i+1],分别与centes 比相等，相等按照bb对称的方式去找
 * 3. 时间复杂度 O(n^2)
 * <p>
 * 解法：① 动态规划 ② 中心扩展法 ③ manacher算法
 * 1.动态规划
 * 2.中心扩展法
 * <p>
 * 3.manacher 算法
 * 变量参考 https://www.jianshu.com/p/6db44081a155
 * 分三种情况
 * (1.i>=maxright 中心扩展法
 * 2. i<maxright
 * ①  p[mirror=2*center-i]<maxright-i p[i] =  p[mirror]    因为 左右是对称的 所以  i的左右下标的值跟mirror左右是一致的（minleft-maxright范围内）
 * ②  p[mirror]==maxright-i  p[i]至少等于 maxright-i然后从maxright中心扩展法    因为p[mirror]==maxright-i 所以只能确定mirror左边
 * 到minleft与 i的右边到maxright一致，但超出left和right部分就不一定了，有可能maxright右边与 i的左边一致构成回文，而
 * ③  p[mirror]>maxright-i p[i]== maxright-i) 因为如果i的maxright右边构成回文，则 maxright就不可能是现在的下表应该右移至能构成i回文的最右边
 *
 * @author jony.huang
 * @date 2020/8/25 9:44
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        //校验字符串
        if (s == null || "".equals(s)) {
            return s;
        }
//        return officialMethod(s);
        return manacher(s);
        //中心扩展
//        return centerExtension(s);
        //动态规划
//        return dynamicProgramming(s);
    }

        public String officialMethod(String s) {
            int start = 0, end = -1;
            StringBuffer t = new StringBuffer("#");
            for (int i = 0; i < s.length(); ++i) {
                t.append(s.charAt(i));
                t.append('#');
            }
            t.append('#');
            s = t.toString();

            List<Integer> arm_len = new ArrayList<Integer>();
            int right = -1, j = -1;
            for (int i = 0; i < s.length(); ++i) {
                int cur_arm_len;
                if (right >= i) {
                    int i_sym = j * 2 - i;
                    int min_arm_len = Math.min(arm_len.get(i_sym), right - i);
                    cur_arm_len = expand(s, i - min_arm_len, i + min_arm_len);
                } else {
                    cur_arm_len = expand(s, i, i);
                }
                arm_len.add(cur_arm_len);
                if (i + cur_arm_len > right) {
                    j = i;
                    right = i + cur_arm_len;
                }
                if (cur_arm_len * 2 + 1 > end - start) {
                    start = i - cur_arm_len;
                    end = i + cur_arm_len;
                }
            }

            StringBuffer ans = new StringBuffer();
            for (int i = start; i <= end; ++i) {
                if (s.charAt(i) != '#') {
                    ans.append(s.charAt(i));
                }
            }
            return ans.toString();
        }

        public int expand(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
            }
            return (right - left - 2) / 2;
        }


    /**
     * 马拉车算法
     *
     * @return
     */
    private String manacher(String s) {
        //1.插入#，化解奇数偶数问题
        StringBuffer stringBuffer = new StringBuffer("#");
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(s.charAt(i));
            stringBuffer.append("#");
        }
        String ss = stringBuffer.toString();
        char[] chars = ss.toCharArray();

        //2.设置中心点和right边界 ,最长回文 start和end
        //中心点
        int j = -1;
        //右边界
        int right = -1;
        int start = 0;
        int end = -1;
        List<Integer> lens = new ArrayList<Integer>();
        //3.遍历s数组
        for (int i = 0; i < chars.length; i++) {
            int len;
            //4.manache算法+中新扩展
            if (right >= i) {
                int i_sym = 2 * j - i;
                len = Math.min(lens.get(i_sym), right - i);
                len = getRadius(i - len, i + len,chars);
            } else {
                //5.中心扩展
                len = getRadius(i, i, chars);
            }
            //6.存储半径
            lens.add(len);
            //7.变更中心
            if (i + len > right) {
                j = i;
                right = i + len;
            }
            //8.变更最长回文中心
            if (len * 2 > end - start) {
                start = i - len;
                end = i + len;
            }
        }
        StringBuilder s2 = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (chars[i] != '#') {
                s2.append(chars[i]);
            }
        }
        return s2.toString();
    }

    /**
     * 中心扩展，将一个元素i当做中心，然后向两边扩展 left=i-1，right=i+1，比较如果相等，则以i为中心的回文子串长度为right-left，循环此操作。
     * 两种情况
     * 因为回文分 奇数偶数
     * 所以 一个i的回文分为  ，(i,i)和(i,i+1)  （不需要做(i-1,i)因为与(i,i+1)等同）
     *
     * @param s
     * @return
     */
    private String centerExtension(String s) {
        //1.转成char数组
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        //2.以i为中心，遍历数组
        for (int i = 0; i < chars.length - 1; i++) {
            //奇数
            int oddNumber = getLength(i, i, chars);
            //偶数
            int even = getLength(i, i + 1, chars);
            int temporaryLength = Math.max(oddNumber, even);
            if (temporaryLength > end - start + 1) {
                start = i - (temporaryLength - 1) / 2;
                end = i + temporaryLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }


    /**
     * 中心扩展获取长度
     *
     * @param left
     * @param right
     * @param chars
     * @return
     */
    private int getLength(int left, int right, char[] chars) {
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    private int getRadius(int left, int right, char[] chars) {
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        return (right - left - 2)/2;
    }


    /**
     * 1. 最有子结构 P[i,j] = P[i+1,j-1] && S[i]==S[j]
     * 2. 边界 i==j 永为true i+1 == j 为true(适用于左下角是空的情况，剩余左下角都能找到值)，
     * 3. 状态转化  P[i,j] ={ P[i+1,j-1] && S[i]==S[j] , =true( j-i<3) }
     * <p>
     * 表格
     * t = true
     * 因为 P[i,j] = P[i+1,j-1] && S[i]==S[j] ，所以 在比对 (i,j)时需要知道 i+1，j-1也就是表格这个点的左下角点。所以
     * 比对顺序一列一列来
     * 0 1 2 3 4
     * 0 t
     * 1   t
     * 2     t
     * 3       t
     *
     * @param s
     * @return
     */
    private String dynamicProgramming(String s) {
        //1.生成表
        char[] chars = s.toCharArray();
        boolean[][] table = new boolean[chars.length][chars.length];
        int maxlength = 0;
        int beign = 0;
        //2.循环
        for (int j = 0; j < chars.length; j++) {
            for (int i = 0; i < j + 1; i++) {
                //3. 状态转化
                if (i == j || (i + 1 == j && chars[i] == chars[j])) {
                    table[i][j] = true;
                    if (change(i, j, maxlength)) {
                        beign = i;
                        maxlength = j - i + 1;
                    }
                } else {
                    if (table[i + 1][j - 1] == true && chars[i] == chars[j]) {
                        table[i][j] = true;
                        if (change(i, j, maxlength)) {
                            beign = i;
                            maxlength = j - i + 1;
                        }
                    } else {
                        table[i][j] = false;
                    }
                }
            }
        }
        return s.substring(beign, beign + maxlength);
    }

    private boolean change(int i, int j, int length) {
        if (j - i + 1 > length) {
            return true;
        }
        return false;
    }

}
