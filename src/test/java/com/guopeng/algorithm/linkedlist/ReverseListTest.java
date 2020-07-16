package com.guopeng.algorithm.linkedlist;

import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/7/16 14:27
 */
public class ReverseListTest {

    ReverseList reverseList = new ReverseList();

    @Test
    public void reverseList() {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode actual = reverseList.reverseList(l1);
        while (actual != null) {
            System.out.println(actual.val);
            actual = actual.next;
        }
    }
}