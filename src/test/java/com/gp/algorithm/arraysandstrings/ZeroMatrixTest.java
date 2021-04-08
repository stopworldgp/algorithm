package com.gp.algorithm.arraysandstrings;

import com.gp.algorithm.utils.LinkedListUtils;
import org.junit.Test;

/**
 *
 * @author jony.huang
 * @date 2020/8/14 9:48
 */
public class ZeroMatrixTest {

    @Test
    public void setZeroes() {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        zeroMatrix.setZeroes(matrix);
        LinkedListUtils.println(matrix);
    }

    @Test
    public void setZeroes01() {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        zeroMatrix.setZeroes(matrix);
        LinkedListUtils.println(matrix);
    }
}