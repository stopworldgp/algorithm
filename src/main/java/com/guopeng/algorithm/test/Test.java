package com.guopeng.algorithm.test;

import java.util.*;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2021/3/9 17:13
 */
public class Test {
    public static void main(String[] args) {
        List<String> tags = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()).forEachOrdered(e -> tags.add(e.getKey()));
        System.out.println(tags);
        Optional.ofNullable(map).map(m->m.get(1)).orElse(1);
    }
}
