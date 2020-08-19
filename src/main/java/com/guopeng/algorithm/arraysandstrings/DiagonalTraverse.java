package com.guopeng.algorithm.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/cuxq3/
 * 题目：对角线遍历
 * 解题思路：
 * 1、遍历 （i++，0）和 (i=M,j++)
 * 2、每次 (i++，0)都执行  (i--,j++) i>=0.j<N
 * 3、偶数为倒序
 *
 * @author jony.huang
 * @date 2020/8/18 9:51
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        List<Integer> temp = new ArrayList<>();
        int N = matrix.length;
        int M = matrix[0].length;
        int[] result = new int[M * N];
        int k = 0;
        boolean direction = true;
        int row = 0;
        int col = 0;
        //1.遍历 （i++，0）和 (i=M,j++)
        for (int i = 0; i < M; i++) {
            row = 0;
            col = i;
            // direction = true   向上
            if (direction) {
                while (row < N && col >= 0) {
                    temp.add(matrix[row++][col--]);
                }
                for (int i1 = temp.size() - 1; i1 >= 0; i1--) {
                    result[k++] = temp.get(i1);
                }
                temp.clear();
            } else {
                // direction = false   向下
                while (row < N && col >= 0) {
                    result[k++] = matrix[row++][col--];
                }
            }
            direction = !direction;
        }

        for (int i = 1; i < N; i++) {
            row = i;
            col = M - 1;
            // direction = true   向上
            if (direction) {
                while (row < N && col >= 0) {
                    temp.add(matrix[row++][col--]);
                }
                for (int i1 = temp.size() - 1; i1 >= 0; i1--) {
                    result[k++] = temp.get(i1);
                }
                temp.clear();
            } else {
                // direction = false   向下
                while (row < N && col >= 0) {
                    result[k++] = matrix[row++][col--];
                }
            }
            direction = !direction;
        }
        return result;
    }
}

