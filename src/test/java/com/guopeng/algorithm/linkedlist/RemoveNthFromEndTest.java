package com.guopeng.algorithm.linkedlist;

import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/16 13:40
 */
public class RemoveNthFromEndTest {


    RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();

    @Test
    public void removeNthFromEnd() {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode actual = removeNthFromEnd.removeNthFromEnd(l1, 2);
        while (actual != null) {
            System.out.println(actual.val);
            actual = actual.next;
        }
    }
}