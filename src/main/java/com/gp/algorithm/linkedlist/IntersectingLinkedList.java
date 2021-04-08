package com.gp.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/194/two-pointer-technique/746/
 * 相交链表
 * 编写一个程序，找到相交的起始节点
 * <p>
 * 如下面的两个链表：
 * <p>
 * 在节点 c1 开始相交。
 * <p>
 * 示例 1：
 * <p>
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 * <p>
 * 解法：
 * 1. 遍历两个链表
 * 2. 先到尾结点的是短链表的，然后将该指针指向长链表,两个结点继续往前走
 * 3. 当第二个指针到达尾结点，让第二个指针指向短链表,两个结点继续往前走
 * 4. 当两节点相遇时，为相交的起始节点
 * 5. 原理 1，2，3步骤得出两个链表相差长度
 *
 * @author jony.huang
 * @date 2020/7/10 17:28
 */
public class IntersectingLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode q = headA;
        ListNode p = headB;
        while (q != p) {
            q = (q == null) ? headB : q.next;
            p = (p == null) ? headA : p.next;
        }
        return q;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
