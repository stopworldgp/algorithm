package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.FourSum;
import org.junit.Test;

/**
 *
 *  * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
 *  * 使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *  * <p>
 *  * 注意：
 *  * <p>
 *  * 答案中不可以包含重复的四元组。
 *  * <p>
 *  * 示例：
 *  * <p>
 *  * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *  * <p>
 *  * 满足要求的四元组集合为：
 *  * [
 *  * [-1,  0, 0, 1],
 *  * [-2, -1, 1, 2],
 *  * [-2,  0, 0, 2]
 *  * ]
 *  给定数组 nums = [0,0,0,0]，和 target = 0。
 *  [[0,0,0]]
 * @author jony.huang
 * @date 2020/6/5 9:53
 */
public class FourSumTest {

    FourSum fourSum = new FourSum();

    /**
     * 问题汇总：
     * 1.未考虑到 三数之和特殊情况 j>0 && nums[j] == nums[j-1] continue 应该改为 i+1, 以j起始的位置算
     * 2.未考虑 三数之和 和四数之和 特殊情况 nums[i] > target 这种情况只适合正数
     * 总结题不一样了，特殊情况也要跟着变化
     */
    @Test
    public void fourSum() {
//        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = -11;
//        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] nums = new int[]{1,-2,-5,-4,-3,3,3,5};
        System.out.println(fourSum.fourSum(nums, target));
    }
}