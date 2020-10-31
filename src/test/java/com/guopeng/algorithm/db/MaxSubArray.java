package com.guopeng.algorithm.db;

/**
 * @Author theone
 * @Date 2020/10/31 19:46
 * @Version 1.0
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(nums[i], res);
        }
        return res;
    }

}
