package com.guopeng.algorithm.linkedlist;

/**
 * @author jony.huang
 * @date 2020/7/16 13:41
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int x,ListNode y) {
        val = x;
        next = y;
    }
}
