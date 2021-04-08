package com.gp.algorithm.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/clpgd/
 * 题目：旋转矩阵
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * <p>
 * 不占用额外内存空间能否做到？
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 * <p>
 * 解题思路：
 * 1、循环规律， 以4*4矩阵为例
 * 2、先查看四个角的元素， (0,0) ,(0,3) (3,0) (3,3)
 * 3、再看(0,1) (0,2) (1,3) (2,3) (3,1) (3,2) (1,0) (2,0)
 * 4、可能发现一个规律就是  旋转后  (i,j) -> 横坐标 row 为旋转前的纵坐标 col
 * 5、那么纵坐标呢，我们把 坐标 设置为 (i,j) -> (j,i') 有的选择 i' = i-1 有的是 i' = i+1 没有找到规律
 * 6、这时要利用上已有的变量 矩阵长度 n， 这时会发现 i'= n-i-1;满足所有的选择条件，这样 (i,j) -> (j, n-i-1)
 * 7、这样就可以利用temp 临时变量替换
 * 优化
 * 上下翻转，这样(i,j)-> (n-i-1,j)  然后i和j互换 (i,j)-> (j,jn-i-1)也就是上边的结果
 *
 * @author jony.huang
 * @date 2020/8/10 10:11
 */
public class RotationMatrix {

    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //1.上下翻转
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - i - 1][j];
                matrix[rows - i - 1][j] = temp;
            }
        }
//        System.out.println("//////上下翻转///////");
//        LinkedListUtils.println(matrix);
//        System.out.println("///////////////////");
        //2.i和j互换
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        System.out.println("//////对折翻转///////");
//        LinkedListUtils.println(matrix);
//        System.out.println("///////////////////");
    }
}
