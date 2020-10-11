package com.guopeng.algorithm.company.bytedance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author theone
 * @Date 2020/10/11 19:38
 * @Version 1.0
 */
public class FindElementTest {

    FindElement findElement = new FindElement();

    @Test
    public void findElement() {
        int[] array = {4,5, 6, 1, 2, 3};
        int target = 5;
        boolean actual = findElement.findElement(array,target);
        Assert.assertTrue(actual);
    }
}