package com.guopeng.algorithm.linkedlist;

import com.guopeng.algorithm.utils.LinkedListUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/8/3 9:41
 */
public class RotatingLinkedListTest {

    RotatingLinkedList rll = new RotatingLinkedList();
    @Test
    public void rotateRight() {
        ListNode n0 = new ListNode(0);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n0.next = n1;
        n1.next = n2;
        ListNode actual = rll.rotateRight(n0,4);
        LinkedListUtils.println(actual);
    }

    @Test
    public void rotateRight02() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode actual = rll.rotateRight(n1,2);
        LinkedListUtils.println(actual);
    }

    @Test
    public void rotateRight01() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode actual = rll.rotateRight(n1,2);
        LinkedListUtils.println(actual);
    }
}