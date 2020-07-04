package com.guopeng.algorithm;

import com.guopeng.algorithm.lookuptable.TheIntersectionOfTwoArrays;
import org.junit.Assert;
import org.junit.Test;


/**
 * @Author theone
 * @Date 2020/4/18 22:08
 * @Version 1.0
 */
public class TheIntersectionOfTwoArraysTest {

    private TheIntersectionOfTwoArrays theIntersectionOfTwoArrays = new TheIntersectionOfTwoArrays();

    @Test
    public void intersection() {
        //测试 nums1 = [1,2,2,1], nums2 = [2,2] 结果：
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] actuals = theIntersectionOfTwoArrays.intersection(nums1, nums2);
        int[] expecteds = new int[]{2};
        Assert.assertArrayEquals(expecteds, actuals);
        //测试 nums1 = [4,9,5], nums2 = [9,4,9,8,4] 结果：[9,4]
        int[] nums3 = new int[]{4,9,5};
        int[] nums4 = new int[]{9,4,9,8,4};
        int[] actuals1 = theIntersectionOfTwoArrays.intersection(nums3, nums4);
        int[] expecteds1 = new int[]{4,9};
        Assert.assertArrayEquals(expecteds1, actuals1);

    }
}
