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
 * @date 2020/10/14 14:36
 */
public class DouyinCelebritiesTest {

    DouyinCelebrities douyinCelebrities = new DouyinCelebrities();

    @Test
    public void findCelebrities() {
        int n =3;
        int m =3;
        int[][] arr = new int[n][n];
        arr[0][1]=1;
        arr[1][0]=1;
        arr[1][2]=1;
        arr[0][0]=1;
        arr[1][1]=1;
        arr[2][2]=1;
        int actual =douyinCelebrities.findCelebrities(n,m,arr);
        int expect = 1;
        Assert.assertEquals(expect,actual);
    }
}