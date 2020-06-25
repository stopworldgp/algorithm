package com.guopeng.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author theone
 * @Date 2020/6/21 22:00
 * @Version 1.0
 */
public class RepeatingElements {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (k >= (i - map.get(nums[i]))) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
