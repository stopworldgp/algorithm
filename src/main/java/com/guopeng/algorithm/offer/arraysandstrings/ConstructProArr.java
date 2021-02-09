package com.guopeng.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/solution/mian-shi-ti-66-gou-jian-cheng-ji-shu-zu-biao-ge-fe/
 * 题目：构建乘积数组
 * 解题思路：把A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]拆成
 * A[0]×A[1]×…×A[i-1] 和 A[i-1]×A[i+1]×…×A[n-1]
 * 注意事项：
 * B[i] = a[i - 1] * B[i - 1]; 因为B[i] 的浅醉跟B[i-1]前缀就是差了一个 a[i - 1] 所以乘以a[i - 1] 就是B[i]前缀
 * tmp *= a[i + 1]; B[i] *= tmp; 因为B[n-1]就是 前缀的值所以从a.length - 2开始，从后往前 每往前一位就是多乘以一个a[i+1]
 *
 * @author jony.huang
 * @date 2021/2/9 9:38
 */
public class ConstructProArr {
    public int[] constructArr(int[] a) {
        if(a==null|| a.length==0){
            return new int[0];
        }
        int[] B = new int[a.length];
        B[0] = 1;
        for (int i = 1; i < a.length; i++) {
            B[i] = a[i - 1] * B[i - 1];
        }
        int tmp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            B[i] *= tmp;
        }
        return B;
    }
}
