package com.gp.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/197/conclusion/763/
 * 题目：两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 解题思路：
 * 1. 遍历两个链表,将两个几点数相加，
 * 2. 如进位记录进位 1,记录到新节点的下一个节点
 * 3. 然后将相加结果存入新节点
 *
 * @author jony.huang
 * @date 2020/7/23 9:43
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode curr = head;
        //1. 遍历两个链表分别拿到val
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                curr.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                curr.val += l2.val;
                l2 = l2.next;
            }
            if (curr.val >= 10 || l1 != null || l2 != null) {
                curr.next = new ListNode();
                //2. 如进位记录进位 1,记录到新节点的下一个节点
                curr.next.val = curr.val / 10;
                //3. 然后将相加结果存入新节点
                curr.val = curr.val % 10;
            }
            curr = curr.next;
        }
        return head;
    }

}
