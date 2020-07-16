package com.guopeng.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/194/two-pointer-technique/747/
 * 题目：给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 * 解题思路：
 *
 * 1.设置虚拟节点，处理 链表只有一个节点，n=1的情况，1->null,n=1
 * 2.设置 两个指针，一个指针 a 从pseudoHead开始走，另一个指针b 先走 n步，然后两个结点在一起走
 * 2.当多走n步的节点b，先到尾结点时，a节点就是到了指定的位置
 *
 * @author jony.huang
 * @date 2020/7/16 11:26
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //1. 设置虚拟节点
        ListNode pseudoHead = new ListNode(Integer.MAX_VALUE,head);
        //2.设置 两个指针，一个指针 a 从pseudoHead开始走，另一个指针b 先走 n步，然后两个结点在一起走
        ListNode quick = pseudoHead;
        for (int i = 0; i < n; i++) {
            quick = quick.next;
        }
        ListNode slow = pseudoHead;
        //2.当多走n步的节点b，先到尾结点时，a节点就是到了指定的位置
        while (quick.next != null) {
            quick = quick.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return pseudoHead.next;
    }
}
