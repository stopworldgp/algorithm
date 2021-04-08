package com.gp.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/solution/mian-shi-ti-58-ii-zuo-xuan-zhuan-zi-fu-chuan-qie-p/
 * 题目： II. 左旋转字符串
 * 解题思路：利用String.charAt方法 和 n+ s.length() 循环遍历， 通过 %定位下标
 *
 * @author jony.huang
 * @date 2021/2/9 9:31
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuilder s1 = new StringBuilder();
        for (int i = n; i < s.length() + n; i++) {
            s1.append(s.charAt(i % s.length()));
        }
        return s1.toString();
    }
}
