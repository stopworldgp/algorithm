package com.guopeng.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/7/8 9:51
 */
public class DetectCycleTest {

    DetectCycle detectCycle = new DetectCycle();

    @Test
    public void detectCycle() {
        DetectCycle.ListNode node0 = new DetectCycle.ListNode(3);
        DetectCycle.ListNode node1 = new DetectCycle.ListNode(2);
        DetectCycle.ListNode node2 = new DetectCycle.ListNode(0);
        DetectCycle.ListNode node3 = new DetectCycle.ListNode(-4);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        DetectCycle.ListNode node = detectCycle.detectCycle(node0);
        Assert.assertEquals(node1.val,node.val);
    }
}