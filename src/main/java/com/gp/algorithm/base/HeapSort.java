package com.gp.algorithm.base;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

/**
 * 来源：https://blog.csdn.net/xiaole0313/article/details/103899038
 * 题目：堆排序
 * 解题思路：
 * 1. 先初始化一个排序堆，时间复杂度O(n)
 * 2. 然后逐个取顶部数据替换最后一个尾部节点
 * 属性：
 * 一个index 的左右节点：index*2+1，index*2+2
 * 一个index 的父节点：（index-1）/2
 * 堆排序左右节点是无序的
 *
 * @author jony.huang
 * @date 2021/3/8 20:19
 */
public class HeapSort {

    public void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        while (size > 0) {
            heapify(arr,0,size);
                                            swap(arr, 0, --size);
        }


    }

    public void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }


    }

    public void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, arr[(index - 1) / 2]);
            index = (index - 1) / 2;
        }
    }

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }


}
