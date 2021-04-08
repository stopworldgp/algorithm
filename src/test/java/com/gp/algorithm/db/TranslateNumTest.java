package com.gp.algorithm.db;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/10/31 23:58
 * @Version 1.0
 */
public class TranslateNumTest {

    TranslateNum translateNum = new TranslateNum();

    @Test
    public void translateNum() {
        int actual = translateNum.translateNum(12258);
        int expect = 5;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void translateNum1() {
        int actual = translateNum.translateNum(506);
        int expect = 1;
        Assert.assertEquals(expect, actual);
    }
}