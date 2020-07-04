package com.guopeng.algorithm.lookuptable;

import java.util.*;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * @Author theone
 * @Date 2020/4/18 21:42
 * @Version 1.0
 */
public class TheIntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }
        int[] result =resultSet.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
