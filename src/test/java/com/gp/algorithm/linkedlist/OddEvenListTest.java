package com.gp.algorithm.linkedlist;

import com.gp.algorithm.utils.LinkedListUtils;
import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/18 10:21
 */
public class OddEvenListTest {

    OddEvenList oddEvenList = new OddEvenList();

    @Test
    public void oddEvenList() {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode actual = oddEvenList.oddEvenList(l1);
        LinkedListUtils.println(actual);
    }
    @Test
    public void oddEvenList01() {
        ListNode l2 = new ListNode(1, null);
        ListNode l1 = new ListNode(1, l2);
        ListNode actual = oddEvenList.oddEvenList(l1);
        LinkedListUtils.println(actual);
    }
}