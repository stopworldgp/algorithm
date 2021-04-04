package com.guopeng.algorithm.shopee;

/**
 * 来源:https://leetcode-cn.com/problems/greatest-sum-divisible-by-three/
 * 题目:可被三整除的最大和
 * 解题思路：
 * 由题意容易看出是动态规划
 * 关键是如何规划？转移方程是怎样的？
 * 我们知道3+1=4（余1）3+5=8（余2），4+3=7（余1），观察知道
 * <p>
 * 针对第i个元素有两种策略：选和不选，选其中最大的值即可。而这里的最大值可以是前一状态（不选），
 * 或者前一状态加上当前值（选），无非就是三个状态之间的转移。草稿上画下状态及转移关系就一目了然了。
 * <p>
 * 余数为0的数字+余数为0的数字余数为0
 * 余数为0的数字+余数为1的数字余数为1
 * 余数为0的数字+余数为2的数字余数为2
 * <p>
 * 余数为1的数字+余数为0的数字余数为1
 * 余数为1的数字+余数为1的数字余数为2
 * 余数为1的数字+余数为2的数字余数为0
 * <p>
 * 余数为2的数字+余数为0的数字余数为2
 * 余数为2的数字+余数为1的数字余数为0
 * 余数为2的数字+余数为2的数字余数为1
 * 用max_0,1,2存着最大的这三种和。
 * 并不断更新即可。
 * <p>
 * 我的理解： 当选最后一个元素i时，如果加完%3=0 ，则加上否则不加。
 * 所以由以下三种情况
 * 0+0=0
 * 2+1=0
 * 1+2=0
 * 0 不加任何 = 0
 * 所以根据当前i 和 i-1中最大的可得 最后结果
 *
 * @Author theone
 * @Date 2021/4/2 22:59
 * @Version 1.0
 */
public class MaxSumDivThree {
    public int maxSumDivThree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[][] dp = new int[nums.length+1][3];
        dp[0][0] = 0;
        dp[0][1] = Integer.MIN_VALUE;
        dp[0][2] = Integer.MIN_VALUE;

        for (int i = 1; i <= nums.length+1; i++) {
            int num = nums[i - 1];
            if (num % 3 == 0) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][0] + num);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][1] + num);
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][2] + num);
            } else if (num % 3 == 1) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] + num);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + num);
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + num);
            } else {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + num);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][2] + num);
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][0] + num);
            }
        }
        return dp[nums.length][0];
    }
}
