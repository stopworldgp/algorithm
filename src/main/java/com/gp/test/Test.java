package com.gp.test;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.concurrent.Executors;

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
       List<Integer> list = Lists.newArrayList(1,3,45,0);
       Collections.sort(list, Comparator.comparingInt(c -> c));
        System.out.println(list);
    }
}
