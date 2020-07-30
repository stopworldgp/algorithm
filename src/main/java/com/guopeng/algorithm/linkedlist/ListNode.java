package com.guopeng.algorithm.linkedlist;

/**
 * @author jony.huang
 * @date 2020/7/16 13:41
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
