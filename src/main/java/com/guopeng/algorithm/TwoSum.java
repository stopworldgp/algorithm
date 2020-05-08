package com.guopeng.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jony.huang
 * @date 2020/5/8 19:40
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int initialCapacity = (int) ((float) nums.length / 0.75F + 1.0F);
        Map<Integer,Integer> map = new HashMap<>(initialCapacity);
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if(map.containsKey(v) && i != map.get(v)){
                return new int[]{map.get(v),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
