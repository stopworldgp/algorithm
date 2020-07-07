package com.guopeng.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jony.huang
 * @date 2020/7/7 11:14
 */
public class HasCycleTest {


    HasCycle hasCycle = new HasCycle();

    @Test
    public void hasCycle() {
        HasCycle.ListNode listNode0 = new HasCycle.ListNode(3);
        HasCycle.ListNode listNode1 = new HasCycle.ListNode(2);
        HasCycle.ListNode listNode2 = new HasCycle.ListNode(0);
        HasCycle.ListNode listNode3 = new HasCycle.ListNode(-4);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;
        boolean actual = hasCycle.hasCycle(listNode0);
        Assert.assertTrue(actual);
    }
}