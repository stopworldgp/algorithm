package com.guopeng.algorithm.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/ceda1/
 * 题目：最长公共前缀
 * 解题思路：
 * 1. 先将第一个字符串作为基础结果result
 * 2. 遍历strs数组，每个字符串与result比较直到找到不同的位置，然后将result不同位置开始以及后面的char都改为‘’
 * 3. result.toString返回
 *
 * @author jony.huang
 * @date 2020/8/21 9:32
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        char[] result = strs[0].toCharArray();
        for (int i = 1; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < result.length; j++) {
                if (j >= chars.length || chars[j] != result[j]) {
                    while (j < result.length) {
                        if (result[j] == ' ') {
                            break;
                        }
                        result[j++] = ' ';
                    }
                    break;
                }
            }
        }
        String s = new String(result);
        return s.replace(" ", "");
    }

    /**
     * 根据分治算法找到最长前缀
     *
     * @param strs 字符串数组
     * @return
     */
    public String longestCommonPrefixByDac(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = dac(strs, 0, strs.length - 1);
        return result;
    }

    private String dac(String[] strs, int start, int end) {
        if (start == end) {
            return strs[start];
        } else {
            int mid = (start + end) / 2;
            String left = dac(strs, start, mid);
            String right = dac(strs, mid + 1, end);
            return getPrefix(left, right);
        }
    }

    private String getPrefix(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (int i = minLength; i > 0; i--) {
            String leftPrefix = left.substring(0, i);
            String rightPrefix = right.substring(0, i);
            if (leftPrefix.equals(rightPrefix)) {
                return leftPrefix;
            }
        }
        return "";
    }


}
