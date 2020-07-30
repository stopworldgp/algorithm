package com.guopeng.algorithm.linkedlist;

import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/17 9:53
 */
public class RemoveElementsTest {


    private RemoveElements removeElements = new RemoveElements();

    @Test
    public void removeElements() {
        ListNode l7 = new ListNode(6, null);
        ListNode l6 = new ListNode(5, l7);
        ListNode l5 = new ListNode(4, l6);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(6, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode actual = removeElements.removeElements(l1, 6);
        while (actual != null) {
            System.out.println(actual.val);
            actual = actual.next;
        }
    }

}