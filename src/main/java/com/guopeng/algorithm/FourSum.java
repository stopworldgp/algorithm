package com.guopeng.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
 * 使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 *
 * @author jony.huang
 * @date 2020/6/5 9:20
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //1.排序
        Arrays.sort(nums);

        //2.遍历nums
        for (int i = 0; i < nums.length - 3; i++) {
            if (target>0 && nums[i] > target) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            threeSum(nums, target - nums[i], i, result);
        }
        return result;
    }


    private void threeSum(int[] nums, int target, int i, List<List<Integer>> result) {
        //4.遍历 nums[j]
        for (int j = i + 1; j < nums.length - 2; j++) {
            //5.特殊处理 nums[j]大于 0 或 nums[i] == nums[i-1]  continue
            if (target >0 &&  nums[j] > target) {
                continue;
            }
            if (j > i+1 && nums[j] == nums[j - 1]) {
                continue;
            }
            //6. while(l<r)
            int l = j + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[j];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                    l++;
                    r--;
                    //7.特殊处理 while(l<r&& nums[l]==nums[l-1]) l++,r同理
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
    }

}
