package com.guopeng.algorithm.shopee;

/**
 * 来源：https://leetcode-cn.com/problems/interleaving-string/solution/jiao-cuo-zi-fu-chuan-by-leetcode-solution/
 * 题目：交错字符串
 * 解题思路：
 * 1. f（i,j） = f（i-1,j）&& s1(i)==s3(i+j-1) || f（i,j-1）&& s1(i)==s3(i+j-1)
 *
 * @author jony.huang
 * @date 2021/4/6 15:10
 */
public class IsInterleave {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        if (n1 + n2 != n3) {
            return false;
        }
        boolean[] f = new boolean[n2 + 1];
        f[0] = true;
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                int p = i + j - 1;
                if (i > 0) {
                    f[j] = f[j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                if (j > 0) {
                    f[j] = f[j] || f[j - 1] && s2.charAt(j - 1) == s3.charAt(p);
                }
            }
        }
        return f[n2];
    }

}
