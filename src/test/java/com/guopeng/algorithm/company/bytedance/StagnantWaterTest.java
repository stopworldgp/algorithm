package com.guopeng.algorithm.company.bytedance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/10/12 13:55
 */
public class StagnantWaterTest {


    StagnantWater stagnantWater = new StagnantWater();

    @Test
    public void amount() {
        int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expect = 6;
        int actual = stagnantWater.amount(array);
        Assert.assertEquals(expect,actual);
    }
}