package com.gp.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/solution/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-by-leetcode-s/
 * 题目：剑指 Offer 11. 旋转数组的最小数字
 * 解题思路：二分查找，详见解题思路，画图。
 * 注意事项：注意输入是[1,1]这样的情况 ，需要 high -= 1;处理
 *
 * @author jony.huang
 * @date 2021/2/7 13:58
 */
public class RotateMinArray {

    public int minArray(int[] numbers) {
        //1.校验
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int low = 0;
        int high = numbers.length - 1;
        //2.二分查找
        while (low < high) {
            int pivot = low + (high - low) / 2;
            //2.1 中间节点大于最右边，抛出中间节点(因为最右节点都比中间节点小)
            if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
                //2.2 中间节点小于最右边，最左边到中间节点，(中间节点可能最小)
            } else if (numbers[pivot] < numbers[high]) {
                high = pivot;
                //2.3 注意输入是[1,1]这样的情况
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
