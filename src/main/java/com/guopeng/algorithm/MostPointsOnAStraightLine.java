package com.guopeng.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * 直线上最多的点数
 * 给定一个二维平面，平面上有 n 个点，求最多有多少个点在同一条直线上。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,1],[2,2],[3,3]]
 * 输出: 3
 * 解释:
 * ^
 * |
 * |        o
 * |     o
 * |  o
 * +------------->
 * 0  1  2  3  4
 * 示例 2:
 * 输入: [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * 输出: 4
 * 解释:
 * ^
 * |
 * |  o
 * |     o        o
 * |        o
 * |  o        o
 * +------------------->
 * 0  1  2  3  4  5  6
 * <p>
 * 解题思路：
 * 1.根据y=ax ，可以确认 a=y/x  ，相同a的点在同一条直线上
 * 2.考虑特殊情况 x为0的特殊情况 ，设置一个专门记 x=0固定值的。
 * 3.考虑特殊情况，直线不一定都是从(0,0) 开始，如示例二
 * <p>
 * 步骤：
 * 1.遍历 points  获取起始点
 * 2.循环中遍历 points
 * 2.计算a=(y2-y1)/(x2-x1)
 * 3.map put计数
 * 4.比较maxNumber
 *
 * @author jony.huang
 * @date 2020/6/13 13:42
 */
public class MostPointsOnAStraightLine {
    public int maxPoints(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        //1.遍历 points  获取起始点
        int maxResult = 0;
        int tatol;
        int duplicate = 0;
        Map<String, Integer> map = new HashMap<>(16);
        for (int i = 0; i < points.length; i++) {
            map.clear();
            //2.循环中遍历 points
            for (int k = 0; k < points.length; k++) {
                if (i == k) {
                    continue;
                }
                int x = points[k][0] - points[i][0];
                int y = points[k][1] - points[i][1];
                if (points[k][0] == points[i][0] && points[k][1] == points[i][1]) {
                    duplicate++;
                    continue;
                }
                String key;
                //计算a=(y2-y1)/(x2-x1)
                int a = gcd(x, y);
                key = x / a + ":" + y / a;
                // 3.map put计数
                tatol = map.getOrDefault(key, 0);
                map.put(key, ++tatol);
            }
            //4. 比较maxNumber
            int maxTemp = 0;
            for (Map.Entry<String, Integer> integerIntegerEntry : map.entrySet()) {
                if (maxTemp < integerIntegerEntry.getValue()) {
                    maxTemp = integerIntegerEntry.getValue();
                }
            }
            maxResult = Math.max(maxResult,maxTemp+duplicate);
            duplicate =0;
        }
        return maxResult + 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
