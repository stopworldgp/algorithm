package com.guopeng.algorithm.company.bytedance;

/**
 * 题目：
 * 两个排序数组中找第k大的数
 *
 * @Author theone
 * @Date 2020/10/12 20:36
 * @Version 1.0
 */
public class KNumber {

    /**
     * 游标法
     *
     * @param array1
     * @param array2
     * @param k
     * @return
     */
    int findKthInTwoSortedArray1(int[] array1, int[] array2, int k) {
        int i = 0;
        int j = 0;
        for (int l = 0; l < k - 1; l++) {
            if (array1[i] >= array2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Math.min(array1[i], array2[j]);
    }


}
