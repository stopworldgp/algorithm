package com.guopeng.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/solution/2msshuang-zhi-zhen-jie-jue-diao-zheng-shu-zu-shun-/
 * 题目：剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 解题思路：奇数偶数双指针,首尾遍历数组，指针分别找到各自的位置后进行互换
 * 注意事项：互换的时候，不用担心会出现 奇偶互换，因为如果是奇偶，l会++ 然后l==r，即使互换也是一样的
 *
 * @author jony.huang
 * @date 2021/2/8 9:57
 */
public class AdjustOddAndEvenOrder {
    public int[] exchange(int[] nums) {
        //1.创建奇数偶数双指针
        int l = 0;
        int r = nums.length-1;
        //2.循环遍历直至找完
        while (l < r) {
            while (nums[l] % 2 != 0 && l < r) {
                l++;
            }
            while (nums[r] % 2 == 0 && l < r) {
                r--;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }
        return nums;
    }
}
