package com.gp.algorithm.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/cxqdh/
 * 题目：搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * <p>
 * 解题思路：
 * 1.二分查找，找到下标
 * 2.该下标不是有此值，就是无此值该插入位置
 *
 * @author jony.huang
 * @date 2020/8/6 9:24
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        // 1.二分查找，找到下标
        int index = binarySearch(nums, target);
        //2.该下标对应的不是有此值，就比较该值与target，大于则是该下标下一个index
        if(target>nums[index]){
            return index+1;
        }
        return index;
    }

    private int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return mid;
    }
}
