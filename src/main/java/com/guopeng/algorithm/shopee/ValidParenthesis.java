package com.guopeng.algorithm.shopee;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/problems/valid-parentheses/
 * 题目：有效括号
 * 解题思路：
 *
 * @author jony.huang
 * @date 2021/3/25 20:35
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        //获取长度
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        //构建括号对
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        //遍历如果是左括号加入栈，如果是右括号，则判断栈是否为空，或是都等于栈顶
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                if (deque.isEmpty() || !deque.peek().equals(map.get(c))) {
                    return false;
                }
                deque.pop();
            } else {
                deque.push(c);
            }
        }
        //判断是否栈已出完，出完则true
        return deque.isEmpty();
    }
}
