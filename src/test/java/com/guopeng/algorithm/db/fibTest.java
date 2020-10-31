package com.guopeng.algorithm.db;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author theone
 * @Date 2020/10/31 18:17
 * @Version 1.0
 */
public class fibTest {
    Fib fib = new Fib();
    @Test
    public void fib() {
        int actual = fib.fib(2);
        int expect = 1;
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void fib1() {
        int actual = fib.fib(5);
        int expect = 5;
        Assert.assertEquals(expect,actual);
    }
}