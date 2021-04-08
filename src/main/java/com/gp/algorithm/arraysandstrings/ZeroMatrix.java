package com.gp.algorithm.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/ciekh/
 * 题目：零矩阵
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * 输出：
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 * 示例 2：
 * <p>
 * 输入：
 * [
 * [0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]
 * ]
 * 输出：
 * [
 * [0,0,0,0],
 * [0,4,5,0],
 * [0,3,1,0]
 * ]
 * <p>
 * 解题思路：
 * 简单方法
 * 1、 先遍历二维数组，将为0的元素都找到
 * 2、 将为0的元素 横纵都变为0
 *
 * 优解：
 * 1. 借用 i=0 j=(0-cols)和 i=（0-rows） j=0，如果每个节点为0 则将该横竖节点的  i=0,j=该节点的j   i = 该节点的i ，j=0.变为0
 * 2. 遍历i=0 j=(0-cols)和 i=（0-rows） j=0，将对应的一行或一列全变为0；
 * 3. 需特殊处理  i=0 j=(0-cols)和 i=（0-rows） j=0为0的情况，为0则把  i=0 j=(0-cols)和 i=（0-rows）一行或一列变为0
 * @author jony.huang
 * @date 2020/8/14 9:42
 */
public class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        //1、 先遍历二维数组，将为0的元素都找到
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }
        //2、 将为0的元素 横纵都变为0
        for (int[] nums : list) {
            int row = nums[0];
            int col = nums[1];
            for (int i = 0; i < rows; i++) {
                matrix[i][col] = 0;
            }
            for (int i = 0; i < cols; i++) {
                matrix[row][i] = 0;
            }
        }
    }
}
