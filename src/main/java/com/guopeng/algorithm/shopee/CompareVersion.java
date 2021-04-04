package com.guopeng.algorithm.shopee;

/**
 * 来源：https://leetcode-cn.com/problems/compare-version-numbers/solution/java100shuang-zhi-zhen-jian-ji-zuo-fa-by-3bnz/
 * 题目:165. 比较版本号
 * 解题思路
 * 1. 使用v1和v2这两个值来分别计算版本号每个被'.'分割的块的版本号的大小，如果不相等，则进行比较。
 *
 * @Author theone
 * @Date 2021/4/3 10:45
 * @Version 1.0
 */
public class CompareVersion {

    public int compareVersion(String version1, String version2) {

        //长度
        int size1 = version1.length();
        int size2 = version2.length();
        //下标
        int i = 0;
        int j = 0;
        while (i < size1 || j < size2) {
            int v1 = 0;
            int v2 = 0;
            while (i < size1 && version1.charAt(i) != '.') {
                v1 = v1 * 10 + version1.charAt(i) - '0';
                i++;
            }
            while (j < size2 && version2.charAt(i) != '.') {
                v2 = v2 * 10 + version2.charAt(i) - '0';
                j++;
            }
            if (v1 != v2) {
                if (v1 > v2) {
                    return 1;
                }
                return -1;
            }
            //跳过.
            i++;
            j++;
        }
        return 0;
    }
}


