package com.guopeng.algorithm.offer.dp;

/**
 * 来源：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/solution/mian-shi-ti-42-lian-xu-zi-shu-zu-de-zui-da-he-do-2/
 * 题目：连续子数组的最大和
 * 解题思路：
 * 动态规划
 * 注意事项：可能有负数，如[-1]
 *
 * @author jony.huang
 * @date 2021/2/20 14:43
 */
public class ContiguousArray {

    public int maxSubArray(int[] nums) {
        //设置状态
        int d = nums[0];
        int max = nums[0];
        //最小边界开始
        for (int i = 1; i < nums.length; i++) {
            //转移方程
            d = Math.max(nums[i], nums[i] + d);
            max = Math.max(max, d);
        }
        return max;
    }

}
