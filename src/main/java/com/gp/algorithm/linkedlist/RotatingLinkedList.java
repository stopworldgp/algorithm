package com.gp.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/linked-list/f00a2/
 * 题目：旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * <p>
 * 解题思路：
 *  其实与其说是所有节点向右旋转不如说，找到倒数第k个节点作为尾节点，其后的节点指向head。
 * ，如0->1->2->NULL, k = 4 ，2->0->1->NULL 找到1是最后的节点，将2指向头节点。
 * 1.遍历链表记录长度length，将链表变成闭环
 * 2.找到倒数第k个节点curr(由于k有等于length的可能，所以采用闭环，这样curr.next就不会指向null)
 * 3.curr指向null，curr.next为新的head
 *
 *
 * @author jony.huang
 * @date 2020/8/3 9:25
 */
public class RotatingLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr = head;
        //1.因为curr已经指向head，所以起始length = 1
        int length = 1;
        //2.统计长度length;
        for (; curr.next != null; length++) {
            curr = curr.next;
        }
        //3.记录尾结点，便于最后指向head,形成闭环
        curr.next = head;
        curr = head;
        //4.通过length - k % length找到 新的尾节点，由于curr指向 head，所以 i=1；
        for (int i = 1; i < length - k % length; i++) {
            curr = curr.next;
        }
        //5.找到新的head节点
        ListNode newHead = curr.next;
        //6.将新尾结点与原来的节点断开
        curr.next = null;
        return newHead;
    }
}
