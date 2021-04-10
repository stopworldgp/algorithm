package com.gp.algorithm.shopee;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 来源：https://blog.csdn.net/weixin_31578739/article/details/114723178
 * 题目：小Q打气球
 * 解题思路：
 * 双指针
 * @author jony.huang
 * @date 2021/4/10 17:16
 */


public class QplayingBalloons {
    static int search(int[] a, int n, int m) {
        int[] cnt = new int[m + 1];
        Set<Integer> set = new HashSet<>();
        int res = -1;
        int i = 0, j = 0;
        while (i <= j && j < n) {
            cnt[a[j]]++;
            if (a[j] != 0) {
                set.add(a[j]);
            }

            if (set.size() >= m) {
                while (i < j) {
                    if (a[i] != 0 && cnt[a[i]] == 1) {
                        break;
                    }
                    cnt[a[i]]--;
                    i++;
                }
                if (res == -1 || j - i + 1 < res) {
                    res = j - i + 1;
                }
            }
            j++;

        }

        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(search(a, n, m));

    }

}
