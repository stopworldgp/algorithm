package com.guopeng.algorithm.offer.dp;

/**
 * 来源：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/solution/mian-shi-ti-10-ii-qing-wa-tiao-tai-jie-wen-ti-dong/
 * 题目：青蛙跳台接
 * 解题思路：
 * 动态规划
 * 注意事项:大数越界问题
 *
 * @author jony.huang
 * @date 2021/2/20 14:26
 */
public class FrogNumWays {

    public int numWays(int n) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int sum = (a + b) % 1000000007;
            ;
            a = b;
            b = sum;
        }
        return a;
    }

}
