package com.guopeng.algorithm.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/8/7 14:04
 */
public class MergeIntervalTest {

    MergeInterval mergeInterval = new MergeInterval();

    @Test
    public void merge() {
        int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] actual = mergeInterval.merge(nums);
        int[][] expect = {{1, 6}, {8, 10}, {15, 18}};
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void merge01() {
        int[][] nums = {{1,4},{4,5}};
        int[][] actual = mergeInterval.merge(nums);
        int[][] expect = {{1,5}};
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void merge02() {
        int[][] nums = {{1,4},{0,4}};
        int[][] actual = mergeInterval.merge(nums);
        int[][] expect = {{0,4}};
        Assert.assertArrayEquals(expect, actual);
    }


}