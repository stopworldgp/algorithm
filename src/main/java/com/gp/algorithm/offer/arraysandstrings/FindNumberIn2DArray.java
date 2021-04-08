package com.gp.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/solution/mian-shi-ti-04-er-wei-shu-zu-zhong-de-cha-zhao-b-3/
 * 题目：二维数组中的查找
 * 解题思路：解法：从左下角开始遍历或右上角  这样就能有大小顺序之区分了
 *
 * @author jony.huang
 * @date 2021/2/7 11:47
 */
public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //1.校验数组是否为空
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        //初始行
        int row = matrix.length - 1;
        //初始列
        int col = 0;
        //2.遍历验证
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target) {
                return true;
            }
            //小于向左，大于向上
            if (matrix[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }

}
