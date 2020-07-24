package com.guopeng.algorithm.lookupdate;

import com.guopeng.algorithm.lookuptable.ContainsNearbyAlmostDuplicate;
import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3, t = 0
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1, t = 2
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出: false
 * <p>
 * 解题思路：滑动窗口
 * @author jony.huang
 * @date 2020/6/28 9:14
 */
public class ContainsNearbyAlmostDuplicateTest {

    ContainsNearbyAlmostDuplicate containsNearbyAlmostDuplicate = new ContainsNearbyAlmostDuplicate();

    @Test
    public void containsNearbyAlmostDuplicate() {
        int[] nums = {1,2,3,1};
        boolean actual  =  containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate_02(nums,3,0);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsNearbyAlmostDuplicate01() {
        int[] nums = {1,0,1,1};
        boolean actual  =  containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate_02(nums,1,2);
        Assert.assertTrue(actual);

    }

    @Test
    public void containsNearbyAlmostDuplicate02() {
        int[] nums = {1,5,9,1,5,9};
        boolean actual  =  containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate_02(nums,2,3);
        Assert.assertFalse(actual);
    }


    @Test
    public void containsNearbyAlmostDuplicate03() {
        int[] nums = {2,2};
        boolean actual  =  containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate_02(nums,3,0);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsNearbyAlmostDuplicate04() {
        int[] nums = {7,1,3};
        boolean actual  =  containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate_02(nums,2,3);
        Assert.assertTrue(actual);
    }


    @Test
    public void containsNearbyAlmostDuplicate05() {
        int[] nums = {-1,2147483647};
        boolean actual  =  containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate_02(nums,1,2147483647);
        Assert.assertFalse(actual);
    }

}