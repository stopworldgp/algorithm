package com.gp.algorithm.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/cuxq3/
 * 题目：对角线遍历
 * 解题思路：
 * 方法1:
 * 1、简化对角线,不区分方向，这样就能取到所有对角线的数据，每个对角线起始(0，j),j从0到M-1，以及(i,M-1),i从1到N-1
 * 2、利用一个direction来区分方向， direction 为true则是向上，false向下，因为对角线的方向总是与上一个相反，所以直接用direction = !direction
 * 方法2：
 * 1.了解当前对角线最后一个和下一个对角线第一个的区别
 * 2.向下  最后一个(i,j)下一个起始(i,j++)或 (i++，M-1)
 * 3.向上  最后一个(i,j)下一个起始(i++,j)或 (N-1，j++)
 * 4.方向  直接用direction = !direction
 * 5.结束时间 while(row<N && col<M)
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

    public int[] findDiagonalOrder2(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int N = matrix.length;
        int M = matrix[0].length;
        int[] result = new int[N * M];
        int row = 0;
        int col = 0;
        int k = 0;
        boolean direction = true;
        //1.遍历
        while (row < N && col < M) {
            //direction为true 向上     row--,col++
            if (direction) {
                while (row >= 0 && col < M) {
                    result[k++] = matrix[row--][col++];
                }
                row++;
                col--;
                if (col == M - 1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                //direction为false 向下
                while (row < N && col >= 0) {
                    result[k++] = matrix[row++][col--];
                }
                row--;
                col++;
                if (row == N - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            direction = !direction;
        }
        return result;
    }

}

