package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.TheIntersectionOfTwoArraysTwo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/4/27 1:24
 * @Version 1.0
 */
public class TheIntersectionOfTwoArraysTwoTest {

    private TheIntersectionOfTwoArraysTwo theIntersectionOfTwoArraysTwo = new TheIntersectionOfTwoArraysTwo();

    @Test
    public void intersection() {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] expecteds = new int[]{4,9};
        int[] actuals = theIntersectionOfTwoArraysTwo.intersection(nums1, nums2);
        Assert.assertArrayEquals(expecteds, actuals);
    }
}
