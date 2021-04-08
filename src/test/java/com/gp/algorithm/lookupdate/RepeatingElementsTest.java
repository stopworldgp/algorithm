package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.RepeatingElements;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/6/21 22:09
 * @Version 1.0
 */
public class RepeatingElementsTest {

    RepeatingElements repeatingElements = new RepeatingElements();

    @Test
    public void containsNearbyDuplicate() {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean actual = repeatingElements.containsNearbyDuplicate(nums,k);
        Assert.assertTrue(actual);
    }
    @Test
    public void containsNearbyDuplicate_01() {
        int[] nums = {1,0,1,1};
        int k = 1;
        boolean actual = repeatingElements.containsNearbyDuplicate(nums,k);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsNearbyDuplicate_02() {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean actual = repeatingElements.containsNearbyDuplicate(nums,k);
        Assert.assertFalse(actual);
    }
}