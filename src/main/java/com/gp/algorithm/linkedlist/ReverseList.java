package com.gp.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/195/classic-problems/750/
 * 题目：反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 解题思路：
 * 思路来源：https://leetcode-cn.com/explore/learn/card/linked-list/195/classic-problems/749/
 * 1. 设置一个前置指针 表示当前节点的前一个节点 prev(默认 null)
 * 2. 设置一个指针 当前节点curr(初始为head)
 * 3. 遍历链表，设置next 为curr的下一个节点，让curr.next指向prev，curr 指向next
 * 4. 遍历结束放回prev
 *
 * @author jony.huang
 * @date 2020/7/16 14:21
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        //1.设置一个前置指针 表示当前节点的前一个节点 prev(默认 null)
        ListNode prev = null;
        // 2. 设置一个指针 当前节点curr(初始为head)
        ListNode curr = head;
        //3. 遍历链表，设置next 为curr的下一个节点，让curr.next指向prev，curr 指向next
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //4. 遍历结束放回prev
        return prev;
    }


}
