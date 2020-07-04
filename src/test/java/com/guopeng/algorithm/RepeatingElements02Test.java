package com.guopeng.algorithm;

import com.guopeng.algorithm.lookuptable.RepeatingElements02;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/6/21 22:29
 * @Version 1.0
 */
public class RepeatingElements02Test {


    RepeatingElements02 repeatingElements02 = new RepeatingElements02();

    @Test
    public void containsNearbyDuplicate() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        int t = 0;
        boolean actual = repeatingElements02.containsNearbyAlmostDuplicate(nums, k, t);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsNearbyDuplicate_01() {
        int[] nums = {1, 0, 1, 1};
        int k = 1, t = 2;
        boolean actual = repeatingElements02.containsNearbyAlmostDuplicate(nums, k, t);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsNearbyDuplicate_02() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int k = 2, t = 3;
        boolean actual = repeatingElements02.containsNearbyAlmostDuplicate(nums, k, t);
        Assert.assertFalse(actual);
    }
}