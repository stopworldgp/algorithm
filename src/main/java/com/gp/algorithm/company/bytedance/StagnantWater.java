package com.gp.algorithm.company.bytedance;

/**
 * 描述：
 * 凹凸不平的地面每当下雨的时候总会积水。假设地面是一维的，每一块宽度都为1，高度是非负整数，那么可以用一个数组来表达一块地面。例如[0,1,0,2,1,0,1,3,2,1,2,1]可以用来表示下图地面：
 * 来源：http://blog.sina.com.cn/s/blog_3fba24680102xi2t.html
 * <p>
 * 思路：
 * https://leetcode-cn.com/problems/volume-of-histogram-lcci/solution/shuang-zhi-zhen-zhi-fang-tu-de-shui-liang-by-realz/
 * 缩小成只有三个台阶 2 0 1 这样就很简单， 找到边界较小的 1 ，然后中间台阶 0 ，积水就是 1-0 = 0 ，再扩展其实就是在在中间插入了n个台阶，
 * 1.设置l，r 指向 直方图 两端
 * 2.比较 l，r大小，例如找到r小
 * 3.则比较 r 和r-- 计算积水
 * 4.剩下比较 l 和r--大小，重复流程
 *
 * @Author theone
 * @Date 2020/10/11 18:12
 * @Version 1.0
 */
public class StagnantWater {

    public int amount(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int l = 0;
        int r = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int res = 0;
        while (l < r) {
            if (height[l] <= height[r]) {
                if (maxLeft > height[l]) {
                    res += maxLeft - height[l];
                } else {
                    maxLeft = height[l];
                }
                l++;
            } else {
                if (maxRight > height[r]) {
                    res += maxRight - height[r];
                } else {
                    maxRight = height[r];
                }
                r--;
            }
        }
        return res;
    }

}
