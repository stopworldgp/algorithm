package com.gp.algorithm.shopee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/problems/largest-number/solution/zui-da-shu-by-leetcode/
 * 题目：最大数
 * 解题思路：
 * 1. 对数组进行排序，但不是最优解，要考虑两个像连的数字是否可以构成最大
 *
 * @author jony.huang
 * @date 2021/4/9 18:04
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        List<String> s = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            s.add(String.valueOf(nums[i]));
        }
        Collections.sort(s, (String s1, String s2) -> (s2 + s1).compareTo(s1 + s2));
        if (s.get(0).equals("0")) {
            return "0";
        }
        String res = "";
        for (String s1 : s) {
            res += s1;
        }

        return res;
    }
}
