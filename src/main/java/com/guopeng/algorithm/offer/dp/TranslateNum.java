package com.guopeng.algorithm.offer.dp;


/**
 * 来源：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/solution/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-by-leetcode-sol/
 * 题目：把数字翻译成字符串
 * 解题思路：Dp
 * 状态转移方法： F(n)=F(n-1)+F(n-2)/F(n-1)  (条件 n-1和n-2是否组成字母)
 *
 * @author jony.huang
 * @date 2021/2/20 16:32
 */
public class TranslateNum {
    public int translateNum(int num) {
        char[] chars = ("" + num).toCharArray();
        //设置状态
        int a = 1;
        int b = 1;
        int res = 1;
        //状态转移方程
        for (int i = 1; i < chars.length; i++) {
            int tmp = Integer.parseInt(String.valueOf(chars[i - 1]) + String.valueOf(chars[i]));
            if (tmp > 9 && tmp < 26) {
                res = a + b;
                a = b;
                b = res;
            }
        }
        return b;
    }
}
