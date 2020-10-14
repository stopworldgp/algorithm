package com.guopeng.algorithm.company.bytedance;

/**
 * 来源：https://blog.csdn.net/sinat_35982107/article/details/98996074
 * 题目：抖音红人
 * 解题思路：
 * 设置二维表格，提供关注被关注
 *
 * @author jony.huang
 * @date 2020/10/13 20:34
 */
public class DouyinCelebrities {

    /**
     * @param n   人数
     * @param m   对数
     * @param arr 二维数组， a对b 是关注
     * @return
     */
    public int findCelebrities(int n, int m, int[][] arr) {
        //1.遍历二维数组，找到所有关注和被关注
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[i][j] == 1 && arr[j][j + 1] == 1) {
                    arr[i][j + 1] = 1;
                }
            }
        }
        //2.按列汇总，一列全是1为红人
        int count = 0;
        for (int i = 0; i < n; i++) {
            int favourite = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 1) {
                    favourite++;
                }
            }
            if (favourite == n) {
                count++;
            }
        }
        return count;
    }

}
