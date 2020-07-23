package com.guopeng.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/197/conclusion/762/
 * 题目：合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 解题思路：
 * 1. 同时遍历两个链表比较
 * 2. 比较当前节点大小，将小的放入新链表
 * 3. 其中一个链表结束，将剩余另一个链表全部灌入
 *
 * @author jony.huang
 * @date 2020/7/23 9:24
 */
public class MergeTwoAscendingLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        //1. 同时遍历两个链表比较,直至链表结束
        while (l1 != null && l2 != null) {
            //  比较当前节点大小，将小的放入新链表
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        //3. 其中一个链表结束，将剩余另一个链表全部灌入
        curr.next = (l1 != null)?l1:l2;
        return head.next;
    }
}
