package com.guopeng.algorithm.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/8/6 9:57
 */
public class SearchInsertTest {

    SearchInsert searchInsert = new SearchInsert();

    @Test
    public void searchInsert() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expect = 2;
        int actual = searchInsert.searchInsert(nums, target);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void searchInsert01() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expect = 1;
        int actual = searchInsert.searchInsert(nums, target);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void searchInsert02() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int expect = 4;
        int actual = searchInsert.searchInsert(nums, target);
        Assert.assertEquals(expect,actual);
    }
}