package com.guopeng.algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/4/27 1:03
 * @Version 1.0
 */
public class DuplicateElementsTest {

    private DuplicateElements duplicateElements = new DuplicateElements();

    @Test
    public void containsDuplicate() {

        /*
        输入: [1,2,3,1]
        输出: true
         */
        int[] nums = new int[]{1, 2, 3, 1};
        boolean condition = duplicateElements.containsDuplicate(nums);
        Assert.assertTrue(condition);
        /*
        输入: [1,2,3,4]
        输出: false
         */
        int[] nums1 = new int[]{1, 2, 3, 4};
        boolean condition1 = duplicateElements.containsDuplicate(nums1);
        Assert.assertFalse(condition1);
    }
}
