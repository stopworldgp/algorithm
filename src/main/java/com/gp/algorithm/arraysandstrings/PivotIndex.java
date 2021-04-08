package com.gp.algorithm.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/yf47s/
 * 题目：寻找数组的中心索引
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 * <p>
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出：3
 * 解释：
 * 索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 * 示例 2：
 * <p>
 * 输入：
 * nums = [1, 2, 3]
 * 输出：-1
 * 解释：
 * 数组中不存在满足此条件的中心索引。
 *  
 * <p>
 * 说明：
 * <p>
 * nums 的长度范围为 [0, 10000]。
 * 任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
 * <p>
 * <p>
 * 解题思路：
 * 想法：
 * 1. 假设有中心索引，设置左边相加和为left ，右侧相加和为right，数组全部元素和为S，S=left+right+中心索引值。
 * 2. 当有中心索引成立时，left==right，S= 2*left+中心索引值。
 * 步骤：
 * 1.遍历数组，拿到S
 * 2.遍历数组元素，每次计算 2*left+中心索引，如果等于S，则返回中心索引
 *
 * @author jony.huang
 * @date 2020/8/4 10:29
 */
public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int S = 0;
        // 1.遍历数组，拿到S
        for (int i = 0; i < nums.length; i++) {
            S+=nums[i];
        }
        int left =0;
        int result =0;
        // 2.遍历数组元素，每次计算 2*left+中心索引，如果等于S，则返回中心索引
        for (int i = 0; i < nums.length; i++) {
            result = left*2+nums[i];
            if(result == S){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
