package com.guopeng.algorithm.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/8/4 10:44
 */
public class PivotIndexTest {

    PivotIndex pivotIndex = new PivotIndex();

    @Test
    public void pivotIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int actual = pivotIndex.pivotIndex(nums);
        int expect = 3;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void pivotIndex01() {
        int[] nums = {-1,-1,-1,0,1,1};
        int actual = pivotIndex.pivotIndex(nums);
        int expect = 0;
        Assert.assertEquals(expect, actual);
    }

}