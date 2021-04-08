package com.gp.algorithm.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/array-and-string/c5tv3/
 * 题目：合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 示例 2:
 * <p>
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * <p>
 * 解题思路：
 * 1. 将数组排序 Arrays.sort
 * 2. 声明结果数组list
 * 3. 比较区间的右端与下一个区间的左端大小，大于则比较下一个区间的右端，找到最大值
 * 4. 小于，则将该区间入list
 *
 * @author jony.huang
 * @date 2020/8/7 10:50
 */
public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }
        //1. 将数组排序 Arrays.sort
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //2. 声明结果数组list
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
                i++;
                right = Math.max(intervals[i][1], right);
            }
            list.add(new int[]{left, right});
        }
        int[][] result = list.toArray(new int[0][]);
        return result;
    }
}
