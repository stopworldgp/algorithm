package com.guopeng.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/solution/mian-shi-ti-53-i-zai-pai-xu-shu-zu-zhong-cha-zha-5/
 * 题目：统计一个数字在排序数组中出现的次数。
 * 解题思路：
 * 1.初始化： 查找target区间的左右边界。
 * 2.循环二分： 当闭区间 [i, j] 无元素时跳出；
 * while(i<=j)，因为如果是i<j 则无法比较j 与target ，因为i<j时能比较到i但比较不到j,
 * 计算中点 m = (i + j) / 2（向下取整）；
 * 若 nums[m] < target ，则 target  在闭区间 [m + 1, j] 中，因此执行 i = m + 1；
 * 若 nums[m] > target  ，则 target  在闭区间 [i, m - 1]中，因此执行 j = m - 1；
 * 若 nums[m] = target  ，则右边界 right  在闭区间 [m+1, j] 中；左边界 left 在闭区间 [i, m-1]中。因此分为以下两种情况：
 * 若查找 右边界  right ，则执行 i = m + 1 ；（跳出时 i 指向右边界）
 * 若查找 左边界  left ，则执行 j = m - 1 ；（跳出时 j 指向左边界）
 * 3.返回值： 应用两次二分，分别查找 right和 left ，最终返回 right - left 即可。
 *
 * 注意事项：while(i<=j) ,如果数组是一个则无法返回数据
 * @author jony.huang
 * @date 2021/2/8 10:56
 */
public class CountSortedArray {

    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    private int helper(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }


}
