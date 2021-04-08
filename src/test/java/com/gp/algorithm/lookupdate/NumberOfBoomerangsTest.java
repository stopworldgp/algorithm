package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.NumberOfBoomerangs;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/6/13 10:26
 */
public class NumberOfBoomerangsTest {

    NumberOfBoomerangs numberOfBoomerangs = new NumberOfBoomerangs();

    @Test
    public void numberOfBoomerangs() {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        int expected = 2;
        int actual = numberOfBoomerangs.numberOfBoomerangs(points);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfBoomerangs_01() {
        int[][] points = {{0, 0}};
        int expected = 0;
        int actual = numberOfBoomerangs.numberOfBoomerangs(points);
        Assert.assertEquals(expected, actual);
    }
}