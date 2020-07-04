package com.guopeng.algorithm.lookuptable;

import java.util.TreeSet;

/**
 * 存在重复元素 III
 * 在整数数组 nums 中，是否存在两个下标 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
 * <p>
 * 如果存在则返回 true，不存在返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3, t = 0
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1, t = 2
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出: false
 * <p>
 * 解题思路：双循环
 * 注意事项：整数相减绝对值超最大整数范围
 *
 * @author jony.huang
 * @date 2020/6/28 9:08
 */
public class ContainsNearbyAlmostDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
        //遍历nums ，取i
        for (int i = 0; i < nums.length; i++) {
            //遍历滑动窗口，i+1到i+k
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                //判断 nums [i] 和 nums [j] 的差的绝对值小于 等于 t
                long a = nums[j];
                long b = nums[i];
                long tmp = Math.abs(a - b);
                if (tmp <= t) {
                    //如果存在返回true否则返回false
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 更优解：
     * 第二个循环变成 TreeSet,这样时间复杂度降为时间复杂度：O(n \log (\min(n,k)))O(nlog(min(n,k)))
     *
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public boolean containsNearbyAlmostDuplicate_02(int[] nums, int k, int t) {
        // nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
        //遍历nums ，取i
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            //平衡二叉树查找
            //找比nums[i]大的中最小值
            Integer g = treeSet.ceiling(nums[i]);
            if (g != null && g <= t + nums[i]) {
                return true;
            }
            //找比nums[i]小的中，最大值
            Integer s = treeSet.floor(nums[i]);
            if (s != null && nums[i] <= t + s) {
                return true;
            }
            treeSet.add(nums[i]);
            if (treeSet.size() > k) {
                treeSet.remove(nums[i-k]);
            }
        }
        return false;
    }

    /**
     * 更有解：
     * 第二个循环变成 分桶，时间复杂度：O(n)
     *
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public boolean containsNearbyAlmostDuplicate_03(int[] nums, int k, int t) {
        // nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
        //遍历nums ，取i
        for (int i = 0; i < nums.length; i++) {
            //遍历滑动窗口，i+1到i+k

        }
        return false;
    }


}
