package com.guopeng.algorithm.linkedlist;

import java.util.PriorityQueue;

/**
 * 来源：https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
 * 题目：合并K个升序链表
 * 解题思路：利用最小堆排序，java priorityqueue
 *
 * @author jony.huang
 * @date 2021/3/16 11:08
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> nodes = new PriorityQueue<ListNode>((o1, o2) -> o1.val - o2.val);
        for (ListNode list : lists) {
            if (list != null) {
                nodes.offer(list);
            }
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (!nodes.isEmpty()) {
            ListNode node = nodes.poll();
            tail.next = node;
            tail = node;
            if (node.next != null) {
                nodes.offer(node);
            }
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
