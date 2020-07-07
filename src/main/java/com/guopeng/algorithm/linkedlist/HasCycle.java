package com.guopeng.algorithm.linkedlist;

/**
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 解法：
 * 1.设置快指针和慢指针
 * 2.遍历的时候快指针走两步，慢指针走一步
 * @author jony.huang
 * @date 2020/7/7 9:53
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode quickPointer = head;
        ListNode slowPointer = head.next;
        while(quickPointer!=slowPointer){
            if(quickPointer==null || quickPointer.next==null ){
                return false;
            }
            slowPointer = slowPointer.next;
            quickPointer = quickPointer.next.next;
        }
        return true;
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
