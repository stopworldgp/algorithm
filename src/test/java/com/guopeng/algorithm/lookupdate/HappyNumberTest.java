package com.guopeng.algorithm.lookupdate;

import com.guopeng.algorithm.lookuptable.HappyNumber;
import org.junit.Assert;
import org.junit.Test;


/**
 * @Author theone
 * @Date 2020/4/27 0:55
 * @Version 1.0
 */

public class HappyNumberTest {

    private HappyNumber happyNumber = new HappyNumber();

    @Test
    public void isHappy() {

        //验证28是快乐数
        boolean condition = happyNumber.isHappy(28);
        Assert.assertTrue(condition);
        //验证 5不是快乐数
        boolean condition1 = happyNumber.isHappy(5);
        Assert.assertFalse(condition1);
    }
}
