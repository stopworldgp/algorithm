package com.gp.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/solution/mian-shi-ti-17-da-yin-cong-1-dao-zui-da-de-n-wei-2/
 * 题目：剑指 Offer 17. 打印从1到最大的n位数
 * 解题思路：Math.pow(10,n)-1获取n位最大数，遍历赋值
 * 注意事项: 遍历是从1开始
 *
 * @author jony.huang
 * @date 2021/2/7 14:35
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        if (n == 0) {
            return new int[0];
        }
        int numbers = (int) Math.pow(10, n) - 1;
        int[] result = new int[numbers];
        //1.遍历从1开始赋值
        for (int i = 0; i < numbers; i++) {
            result[i] = i + 1;
        }
        return result;
    }

}
