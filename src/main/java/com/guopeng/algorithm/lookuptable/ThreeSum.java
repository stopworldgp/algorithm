package com.guopeng.algorithm.lookuptable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * *
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 * @author jony.huang
 * @date 2020/6/2 9:30
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        //1.排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        //2.遍历 i
        for (int i = 0; i < nums.length - 2; i++) {
            //3.处理特殊情况处理，排序后 大于0后，是不可能三数之和等于0
            if (nums[i] > 0) {
                continue;
            }
            //3.处理特殊情况处理，i-1 的三数之和包含了 i的结果
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            //采用之前两数之和方法
            while (l < r) {
                int sum = nums[r] + nums[l] + nums[i];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[r], nums[l]));
                    r--;
                    l++;
                    //3.处理特殊情况处理，重复结果删掉
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }


}
