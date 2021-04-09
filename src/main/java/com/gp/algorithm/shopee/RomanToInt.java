package com.gp.algorithm.shopee;

import java.util.HashMap;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/problems/roman-to-integer/solution/yong-shi-9993nei-cun-9873jian-dan-jie-fa-by-donesp/
 * 题目: 罗马数字转整数
 * 解题思路
 * 根据前一个和后一个比较，计算是加还是减
 *
 * @Author theone
 * @Date 2021/4/4 10:39
 * @Version 1.0
 */
public class RomanToInt {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        //前后比较
        int pre = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int cur = map.get(s.charAt(0));
            if (pre < cur) {
                sum -=pre;
            } else {
                sum += pre;
            }
            pre = cur;
        }
        sum += pre;
        return sum;
    }
}
