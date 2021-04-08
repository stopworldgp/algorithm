package com.gp.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/7/10 17:49
 */
public class IntersectingLinkedListTest {

    IntersectingLinkedList intersectingLinkedList = new IntersectingLinkedList();

    @Test
    public void getIntersectionNode() {
        IntersectingLinkedList.ListNode listNodeA1 = new IntersectingLinkedList.ListNode(2);
        IntersectingLinkedList.ListNode listNodeA2 = new IntersectingLinkedList.ListNode(2);
        IntersectingLinkedList.ListNode listNodeA3 = new IntersectingLinkedList.ListNode(2);
        listNodeA1.next = listNodeA2;
        listNodeA2.next = listNodeA3;
        IntersectingLinkedList.ListNode listNodeB1 = new IntersectingLinkedList.ListNode(2);
        IntersectingLinkedList.ListNode listNodeB2 = new IntersectingLinkedList.ListNode(2);
        listNodeB1.next = listNodeB2;
        IntersectingLinkedList.ListNode actual = intersectingLinkedList.getIntersectionNode(listNodeA1, listNodeB1);
        Assert.assertNull(actual);
    }

    @Test
    public void getIntersectionNode02() {
        IntersectingLinkedList.ListNode listNodeA1 = new IntersectingLinkedList.ListNode(0);
        IntersectingLinkedList.ListNode listNodeA2 = new IntersectingLinkedList.ListNode(9);
        IntersectingLinkedList.ListNode listNodeA3 = new IntersectingLinkedList.ListNode(1);
        IntersectingLinkedList.ListNode listNode1 = new IntersectingLinkedList.ListNode(2);
        IntersectingLinkedList.ListNode listNode2 = new IntersectingLinkedList.ListNode(4);
        listNodeA1.next = listNodeA2;
        listNodeA2.next = listNodeA3;
        listNodeA3.next = listNode1;
        IntersectingLinkedList.ListNode listNodeB1 = new IntersectingLinkedList.ListNode(3);
        listNodeB1.next = listNode1;
        listNode1.next = listNode2;
        IntersectingLinkedList.ListNode actual = intersectingLinkedList.getIntersectionNode(listNodeA1, listNodeB1);
        IntersectingLinkedList.ListNode expected = listNode1;
        Assert.assertEquals(expected,actual);
    }
}