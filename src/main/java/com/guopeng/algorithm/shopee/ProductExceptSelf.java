package com.guopeng.algorithm.shopee;

/**
 * 来源：https://leetcode-cn.com/problems/minimum-cost-for-tickets/solution/zui-di-piao-jie-by-leetcode-solution/
 * 题目: 最低票价
 * 解题思路
 * 最大的花销等于，购买的票的时间加上后续的钱
 * 1. dp[i]=Math.max(dp[j1]+cost[0],dp[j3]+cost[0],dp[j30]+cost[0])
 * @Author theone
 * @Date 2021/4/4 12:43
 * @Version 1.0
 */
public class ProductExceptSelf {

    private int[] nums;
    private int[] dp;
    private int[] costs;
    public int[] productExceptSelf(int[] nums) {
        this.nums = nums;
        this.dp = new int[nums.length];
        this.costs = nums;
        return null;
    }
}
