package com.guopeng.algorithm.arraysandstrings;

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
        return dynamicProgramming(s);
    }


    /**
     * 1. 最有子结构 P[i,j] = P[i+1,j-1] && S[i]==S[j]
     * 2. 边界 j-1-(i+1)+1<2 => j-i<3   永为true
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
