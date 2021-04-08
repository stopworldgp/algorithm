package com.gp.algorithm.company.bytedance;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/10/12 21:27
 * @Version 1.0
 */
public class KNumberTest {

    KNumber kNumber = new KNumber();

    @Test
    public void findKthInTwoSortedArray1() {
        int[] array1 = {1,2,4,5,6};
        int[] array2 = {2,5,5,7};
        int actual = kNumber.findKthInTwoSortedArray1(array1,array2,2);
        int expect = 2;
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void findKthInTwoSortedArray2() {
        int[] array1 = {1,2,4,5,6};
        int[] array2 = {2,5,5,7};
        int actual = kNumber.findKthInTwoSortedArray1(array1,array2,6);
        int expect = 5;
        Assert.assertEquals(expect,actual);
    }
}