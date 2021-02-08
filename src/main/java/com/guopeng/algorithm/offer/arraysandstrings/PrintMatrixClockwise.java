package com.guopeng.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/solution/shun-shi-zhen-da-yin-ju-zhen-by-leetcode-solution/
 * 题目：顺时针打印矩阵
 * 解题思路：模拟分层
 * 一层一层遍历，简单理解只是遍历一层
 * 设置(top, left)，(top, right)，(bottom, left)，(bottom, right) 四个点移动
 * <p>
 * 对于每层,从左上方开始以顺时针的顺序遍历所有元素。假设当前层的左上角位于(top, left),右下角位于(bottom, right),按照如下顺序遍历当前层的元素。
 * 1,从左到右遍历上侧元素,依次为(top, left)到(top, right).
 * 2.从上到下遍历右侧元素,依次为(top + 1, right)到(bottom, right)
 * 3.如果left<right且top<bottom,则从右到左遍历下侧元素,依次为(bottom, right- 1)到bottom,left-1),以及从下到上遍历左侧元素,依次为(bottom, left)到(top + 1, lef)
 * 遍历完当前层的元素之后,将left和top分别增加1,将right和bottom分别减少1,进入下一层继续遍历,直到遍历完所有元素为止。
 * 注意事项：
 * 从左往右，从下到上 需要加个校验   if (left < right && top < bottom)  防止剩下一行时，从左往右加了一遍后又从右往左来一遍(靠 top < bottom控制)
 * 同理 剩一列
 *
 * @author jony.huang
 * @date 2021/2/8 16:40
 */
public class PrintMatrixClockwise {


    public int[] spiralOrder(int[][] matrix) {
        //0.校验
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        //1. 初始化结果数组
        int rowMax = matrix.length;
        int colMax = matrix[0].length;
        int[] result = new int[rowMax * colMax];
        //2.1 层循环
        int index = 0;
        int top = 0;
        int left = 0;
        int right = colMax;
        int bottom = rowMax;
        //2.2 从左往右
        for (int col = left; col < right; col++) {
            result[index++] = matrix[top][col];
        }
        //2.3 从上往下
        for (int row = top; row < bottom; row++) {
            result[index++] = matrix[row][right];
        }
        //2.4 校验剩下一行或一列 避免重复添加，从左往右 又再同一行从右往左
        if (left < right && top < bottom) {
            //2.5 从右到左
            for (int col = right-1; col >=left; col--) {
                result[index++] = matrix[bottom][col];
            }
            //2.6 从下到上
            for (int row = bottom-1; row >=top; row--) {
                result[index++] = matrix[row][left];
            }
        }


    }


}
