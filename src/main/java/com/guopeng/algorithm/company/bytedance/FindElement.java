package com.guopeng.algorithm.company.bytedance;

/**
 * 给定一个有序的旋转数组，查找某个元素是否在数组内，eg： ［4 5 6 1 2 3］target=5
 * 思路：
 * 二分查找
 * 1.情况1 target 在 array[start] < target  <array[mid]  end = mid -1 否则在另一个半区
 * 2.情况1 target 在 array[mid] < target    <array[end]  start = mid+1 否则在另一个半区
 * 备注：
 * 为什么不能直接二分查找，因为如果数组是6 1 2 3 4 5    target =6 则 会划分到 3 4 5，所以需要选择有序的区间
 * @Author theone
 * @Date 2020/10/11 19:11
 * @Version 1.0
 */
public class FindElement {

    public boolean findElement(int[] array, int target) {
        if (array == null || array.length == 0) {
            return false;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] >= array[start]) {
                if( target>=array[start]&&target<array[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            } else {
                if(target>array[mid]&&target<=array[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
