package com.guopeng.algorithm.shopee;

/**
 * 来源：https://leetcode-cn.com/problems/decode-string/solution/zi-fu-chuan-jie-ma-by-leetcode-solution/
 * 题目:字符串解码
 * 解题思路
 * 1. 递归求解
 * 2. 先判断是否到头
 *  if (ptr == src.length() || src.charAt(ptr) == ']') {
 *             return "";
 *         }
 * 3. 再判断是否为数字，是数字记录数字，然后获取数字后边的字符串 ，根据数字复制多次
 * 4. 不是数字，一个一个去获取字符
 * 5. 返回结果+getString();
 *
 * Character.isDigit ,Character.isLetter,Chardcter.isDigit
 *
 * @Author theone
 * @Date 2021/4/3 11:31
 * @Version 1.0
 */
public class DecodeString {

    private String src;
    private int ptr;

    public String decodeString(String s) {
        this.ptr = 0;
        this.src = s;
        return getString();
    }

    private String getString() {
        if (ptr == src.length() || src.charAt(ptr) == ']') {
            return "";
        }
        int cur = src.charAt(ptr);
        int retry = 0;
        String result = "";

        if (Character.isDigit(cur)) {
            retry = getInt();
            //去掉左括号
            ptr++;
            //获取字符串
            String s = getString();
            //去掉右括号
            ptr++;
            while (retry-- > 0) {
                result += s;
            }
        } else if (Character.isLetter(cur)) {
            result = String.valueOf(src.charAt(ptr++));
        }
        return result + getString();
    }

    private int getInt() {
        int val = 0;
        while (ptr < src.length() && Character.isDigit(src.charAt(ptr))) {
            val = val * 10 + src.charAt(ptr++) - '0';
        }
        return val;
    }
}
