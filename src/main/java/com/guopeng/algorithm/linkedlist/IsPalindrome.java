package com.guopeng.algorithm.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/195/classic-problems/754/
 * 题目：回文链表
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * 解题思路：
 * 方法一:
 * 1. 遍历一遍链表将值查存到数组中
 * 2. 用头尾指针遍历数组，index =0 ，index = length-1，比较值是否相等
 * 方法二:
 * 1.用快慢指针，找到后半段节点起始,quick != null && quick.next!=null来当判断条件，quick!=null 是链表为偶数的情况，quick.next ！=为奇数
 *   的情况，区别奇数，两个链表都有同一个节点作为最后一个节点
 * 2.将后半段链表进行翻转
 * 3.将前半段后和半段进行比较是否值相等
 * 4.考虑特殊情况，但节点 ，两个节点
 * @author jony.huang
 * @date 2020/7/18 11:30
 */
public class IsPalindrome {
    public boolean isPalindromeArrayMethod(ListNode head) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            int a = list.get(i);
            int b = list.get(list.size() - i - 1);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeReverseMethod(ListNode head) {
        //4.考虑特殊情况，但节点 ，两个节点
        if(head ==null || head.next ==null){
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        //1.用快慢指针，找到后半段节点起始，
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null && quick.next!=null) {
            slow =  slow.next;
            quick = quick.next.next;
        }
        ListNode first = head;
        //2.将后半段链表进行翻转
        ListNode second = reverse(slow);
        //3.将前半段后和半段进行比较是否值相等
        while(second !=null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    /**
     * 翻转链表
     * @param head
     * @return
     */
    private ListNode reverse(ListNode head){
        //1.设置一个前置指针 表示当前节点的前一个节点 prev(默认 null)
        ListNode prev = null;
        // 2. 设置一个指针 当前节点curr(初始为head)
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
