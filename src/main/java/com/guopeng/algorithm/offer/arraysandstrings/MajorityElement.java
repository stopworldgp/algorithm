package com.guopeng.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/solution/mian-shi-ti-39-shu-zu-zhong-chu-xian-ci-shu-chao-3/
 * 题目：剑指 Offer 39. 数组中出现次数超过一半的数字
 * 解题思路：摩尔投票 ,核心理念为 票数正负抵消 ，若记 众数 的票数为 +1+1 ，非众数 的票数为 -1−1 ，则一定有所有数字的 票数和 > 0>0 。
 * 注意事项：当票数为0时，变更element，第一次遍历完拿到众数后，在遍历一次获取众数数量，来判定是否大于一半
 * @author jony.huang
 * @date 2021/2/7 11:47
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int votes = 0;
        int element = 0;
        for (int num : nums) {
            if (votes == 0) element = num;
            votes += num == element ? 1 : -1;
        }
        int count = 0;
        for (int num : nums) {
            if (element == num) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return element;
        } else {
            return 0;
        }
    }

}
