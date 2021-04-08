package com.gp.algorithm.arraysandstrings;

import com.gp.algorithm.utils.LinkedListUtils;
import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/8/13 14:08
 */
public class RotationMatrixTest {

    RotationMatrix rotationMatrix = new RotationMatrix();

    @Test
    public void rotate() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotationMatrix.rotate(matrix);
        LinkedListUtils.println(matrix);
    }

    @Test
    public void rotate01() {
        int[][] matrix =        {
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        rotationMatrix.rotate(matrix);
        LinkedListUtils.println(matrix);
    }



}