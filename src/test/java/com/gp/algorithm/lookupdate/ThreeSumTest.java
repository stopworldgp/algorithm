package com.gp.algorithm.lookupdate;

import com.google.common.collect.Lists;
import com.gp.algorithm.lookuptable.ThreeSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jony.huang
 * @date 2020/6/2 9:43
 */
public class ThreeSumTest {

    ThreeSum threeSum = new ThreeSum();

    @Test
    public void threeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result  = threeSum.threeSum(nums);
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(Lists.newArrayList(-1, 0, 1));
        answer.add(Lists.newArrayList(-1, -1, 2));
        Assert.assertFalse( answer.equals(result));

    }

}