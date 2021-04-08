package com.gp.algorithm.linkedlist;

/**
 * 环形链表 II
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 说明：不允许修改给定的链表。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * <p>
 * 解题思路：
 * 1. 找出是否循环 快慢指针
 * 2. 设置part1 = head ， part2= 相遇点，两个part每次都向前走一步，直到相遇为环的起始点
 * 原理：慢指针  slow = l+s(l:head到环起始点距离，s为环起始点到相遇点距离)，quick = l+s+nc(c环的长度)
 *
 * 遇到问题： 采用HasCyle方法无法按照上面的解题思路找到，原因上面思路前提是 公式满足基础是快慢指针都是从head起始走，而HasCyle快指针已经先走了一次
 * @author jony.huang
 * @date 2020/7/8 9:42
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        //1.找出是否循环
        ListNode slowPointer = head;
        ListNode quickPointer = head;
        while (true) {
            if (quickPointer == null || quickPointer.next == null) {
                return null;
            }
            slowPointer = slowPointer.next;
            quickPointer = quickPointer.next.next;
            if(slowPointer == quickPointer){
                break;
            }
        }
        //2. 找出循环的起始点
        ListNode part1 = head;
        ListNode part2 = quickPointer;
        while (part1 != part2) {
            part1 = part1.next;
            part2 = part2.next;
        }
        return part2;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
