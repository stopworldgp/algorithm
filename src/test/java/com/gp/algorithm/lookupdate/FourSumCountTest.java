package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.FourSumCount;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/6/6 15:06
 */
public class FourSumCountTest {

    FourSumCount fourSumCount = new FourSumCount();

    @Test
    public void fourSumCount() {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        int expected = 2;
        int actual = fourSumCount.fourSumCount(A,B,C,D);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void fourSumCount_01() {
        int[] A = {0,0};
        int[] B = {0,0};
        int[] C = {0,0};
        int[] D = {0,0};
        int expected = 16;
        int actual = fourSumCount.fourSumCount(A,B,C,D);
        Assert.assertEquals(expected,actual);
    }
}