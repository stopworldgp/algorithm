package com.guopeng.algorithm.lookuptable;

import java.util.*;

/**
 * @Author theone
 * @Date 2020/4/27 1:08
 * @Version 1.0
 */
public class TheIntersectionOfTwoArraysTwo {
    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(map.get(nums1[i])!=null){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else {
                map.put(nums1[i],1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(map.get(nums2[i])!=null&&map.get(nums2[i])>0){
                map.put(nums2[i],map.get(nums2[i])-1);
                list.add(nums2[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
