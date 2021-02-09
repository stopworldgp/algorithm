package com.guopeng.algorithm.offer.dp;

/**
 * 来源：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/solution/mian-shi-ti-10-i-fei-bo-na-qi-shu-lie-dong-tai-gui/
 * 题目：斐波那契数列
 * 解题思路：F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 注意事项：大数越界问题 % 1000000007
 * a=0就是初始的F(0) = 0,   b就是初始的F(1) = 1，n=0 取a，n=1，取a=b n>2后同理
 * @author jony.huang
 * @date 2021/2/9 13:58
 */
public class Fib {

    public int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp % 1000000007;
        }
        return a;
    }

}
