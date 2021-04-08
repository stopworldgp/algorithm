package com.gp.algorithm.company.bytedance;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/10/11 20:03
 * @Version 1.0
 */
public class MaxProfitTest {

    MaxProfit maxProfit = new MaxProfit();

    @Test
    public void findMaxProfit() {
        int[] array = {7,1,5,3,6,4};
        int expect = 5;
        int actaul = maxProfit.findMaxProfit(array);
        Assert.assertEquals(expect,actaul);
    }

    @Test
    public void findMaxProfit1() {
        int[] array = {7,6,4,3,1};
        int expect = 0;
        int actaul = maxProfit.findMaxProfit(array);
        Assert.assertEquals(expect,actaul);
    }
}