package com.guopeng.algorithm.shopee;

/**
 * 来源：https://leetcode-cn.com/problems/minimum-cost-for-tickets/solution/zui-di-piao-jie-by-leetcode-solution/
 * 题目: 最低票价
 * 解题思路
 * 最大的花销等于，购买的票的时间加上后续的钱
 * 1. dp[i]=Math.max(dp[j1]+cost[0],dp[j3]+cost[0],dp[j30]+cost[0])
 *
 * @Author theone
 * @Date 2021/4/4 12:43
 * @Version 1.0
 */
public class MincostTickets {
    private int[] days;
    private Integer[] meno;
    private int[] costs;
    private int[] date = new int[]{1, 7, 30};

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.meno = new Integer[days.length];
        this.costs = costs;
        return dp(0);
    }

    private int dp(int i) {
        if (i >= days.length) {
            return 0;
        }
        if (meno[i] != null) {
            return meno[i];
        }
        int j = i;
        meno[i] = Integer.MAX_VALUE;
        for (int k = 0; k < 3; k++) {
            while (j < days.length && days[j] < days[i] + date[k]) {
                j++;
            }
            meno[i] = Math.min(meno[i], dp(j) + costs[k]);
        }
        return meno[i];
    }


}
