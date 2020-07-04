package com.guopeng.algorithm;

import com.guopeng.algorithm.lookuptable.TwoSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author jony.huang
 * @date 2020/5/8 19:44
 */
public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target =  9;
        Assert.assertArrayEquals(new int[]{0,1},twoSum.twoSum(nums,target));

    }
}
