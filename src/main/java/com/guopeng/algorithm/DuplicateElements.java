package com.guopeng.algorithm;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author theone
 * @Date 2020/4/27 1:01
 * @Version 1.0
 */
public class DuplicateElements {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
