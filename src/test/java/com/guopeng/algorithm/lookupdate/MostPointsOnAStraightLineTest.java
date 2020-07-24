package com.guopeng.algorithm.lookupdate;

import com.guopeng.algorithm.lookuptable.MostPointsOnAStraightLine;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/6/13 14:02
 */
public class MostPointsOnAStraightLineTest {


    MostPointsOnAStraightLine mostPointsOnAStraightLine = new MostPointsOnAStraightLine();

    @Test
    public void maxPoints() {
        int[][] points = {{1,1},{2,2},{3,3}};
        int expected = 3;
        int actual = mostPointsOnAStraightLine.maxPoints(points);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void maxPoints_01() {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int expected = 4;
        int actual = mostPointsOnAStraightLine.maxPoints(points);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void maxPoints_02() {
        int[][] points = {{0,0}};
        int expected = 1;
        int actual = mostPointsOnAStraightLine.maxPoints(points);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void maxPoints_03() {
        int[][] points = {{1,1},{1,1},{2,2},{2,2}};
        int expected = 4;
        int actual = mostPointsOnAStraightLine.maxPoints(points);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void maxPoints_04() {
        int[][] points = {{0,0},{0,0}};
        int expected = 2;
        int actual = mostPointsOnAStraightLine.maxPoints(points);
        Assert.assertEquals(expected,actual);
    }

}