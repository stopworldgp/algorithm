package com.guopeng.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 回旋镖的数量
 * <p>
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * <p>
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [[0,0],[1,0],[2,0]]
 * <p>
 * 输出:
 * 2
 * <p>
 * 解释:
 * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 *
 * @author jony.huang
 * @date 2020/6/10 9:17
 */
public class NumberOfBoomerangs {

    /**
     * 题目链接：https://leetcode-cn.com/explore/orignial/card/all-about-lockup-table/239/learn-to-use-keys/1001/
     * 解题思路：
     * 1. 一个点，找出所有到这个点相等的点集合
     * 2. 当找出这些点后，如何计算有多少对组合，转化为组合排列问题
     * 3. 比如 到a点距离相等的点有 b，c，那么组合就是 abc和acb，也就是 2*（2-1），当是n时为 n*(n-1)组
     * 4. 所以最终的解题思路为，遍历 二维数组，找出每个点对应与其距离相等的所有点，然后计算这些所有点的组合数，相加为最终结果。
     * <p>
     * 5.优化项，参考leetcode 提交时间最少的代码，有两点优化，一点：map.clear比new 更快，二点，将计算组合数由 n*(n-1)换成 (1+2+...+n-1)*2
     * 原因  1+2+...+n = (n+1)*n/2 ,公式证明：https://zhidao.baidu.com/question/140498967.html
     *
     * @param points
     * @return
     */
    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        Map<Double, Integer> map = new HashMap<>();
        int total;
        //1.遍历 二维数组
        for (int i = 0; i < points.length; i++) {
            //2.遍历 二维数组找到与这个点 距离相等的所有点
            map.clear();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                double distance = calculateDistance(points[i], points[j]);
                if (map.containsKey(distance)) {
                    sum += total = map.getOrDefault(distance, 0);
                    map.put(distance, ++total);
                } else {
                    map.put(distance, 1);
                }
            }
        }
        return sum << 1;
    }

    private double calculateDistance(int[] points0, int[] points1) {
        return Math.pow(points0[0] - points1[0], 2) + Math.pow(points0[1] - points1[1], 2);
    }

}
