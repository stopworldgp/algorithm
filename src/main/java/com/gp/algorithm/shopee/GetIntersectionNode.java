package com.gp.algorithm.shopee;

/**
 * 来源：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/solution/
 * 题目:两个链表的第一个公共节点
 * 解题思路：
 * 1.双指针 ，当第二次循环碰到则是公共点
 *
 * @Author theone
 * @Date 2021/4/9 23:20
 * @Version 1.0
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return a;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
