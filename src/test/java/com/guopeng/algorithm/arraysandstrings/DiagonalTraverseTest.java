package com.guopeng.algorithm.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/8/19 9:49
 */
public class DiagonalTraverseTest {

    @Test
    public void findDiagonalOrder() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expect = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        int[] actual = diagonalTraverse.findDiagonalOrder(matrix);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void findDiagonalOrder01() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] expect = {1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12};
        int[] actual = diagonalTraverse.findDiagonalOrder(matrix);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void findDiagonalOrder02() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        int[] expect = {1, 2, 3, 5, 4, 6, 7, 8};
        int[] actual = diagonalTraverse.findDiagonalOrder(matrix);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void findDiagonalOrder03() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expect = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        int[] actual = diagonalTraverse.findDiagonalOrder2(matrix);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void findDiagonalOrder04() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] expect = {1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12};
        int[] actual = diagonalTraverse.findDiagonalOrder2(matrix);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void findDiagonalOrder05() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        int[] expect = {1, 2, 3, 5, 4, 6, 7, 8};
        int[] actual = diagonalTraverse.findDiagonalOrder2(matrix);
        Assert.assertArrayEquals(expect, actual);
    }
}