package com.gp.algorithm.shopee;

import java.util.*;

/**
 * 来源:https://leetcode-cn.com/problems/subarray-sum-equals-k/
 * 题目:560. 和为K的子数组
 * 解题思路
 * 1. 前缀+hash
 *  [j,i] 的和是key
 * 2. pre[i] -  pre[j-1] = k
 * 3. pre[i]-k = pre[j-1];
 * @Author theone
 * @Date 2021/4/3 9:15
 * @Version 1.0
 */
public class SubarraySum {

    public int subarraySum(int[] nums, int k) {
        int count =0;
        int pre =0 ;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
