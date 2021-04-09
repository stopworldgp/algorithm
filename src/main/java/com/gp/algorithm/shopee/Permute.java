package com.gp.algorithm.shopee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/problems/permutations/solution/quan-pai-lie-by-leetcode-solution-2/
 * 题目：全排列
 * 解题思路：
 * 回溯法
 * [8, 9 | 2, 5, 10]  左边是已交换的数组，右边是未交换的数组，只要将下一个位置替换为右边的即可
 * 如何让右边三个都试一遍，可以采用递归的方式，每次放不同的
 *
 * @author jony.huang
 * @date 2021/4/9 17:15
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        //结果
        List<List<Integer>> res = new ArrayList<>();
        //原数组
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        //回溯法
        trackback(nums.length, res, output, 0);
        return res;

    }

    private void trackback(int n, List<List<Integer>> res, List<Integer> output, int first) {
        //最后一个，存结果
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
            return;
        }
        //当前节点可以跟后续节点进行互换
        for (int i = first; i < n; i++) {
            //交换
            Collections.swap(output, first, i);
            trackback(n, res, output, first + 1);
            //换回去，换一个解继续遍历。
            Collections.swap(output, first, i);
        }
    }
}
