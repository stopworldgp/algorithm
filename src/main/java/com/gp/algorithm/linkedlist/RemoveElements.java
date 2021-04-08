package com.gp.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/195/classic-problems/752/
 * 题目：  移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * 解题思路：
 * 1. 设置虚拟节点pseudoNode，在链表删除节点时，利用虚拟节点比较容易删除head节点。
 * 2. 设置prev和curr两个指针
 * 3. 遍历链表将节点等于 val删掉（删除节点时链表发生变更，只将curr下移，prev不动，因为链表删除一个节点后curr发生变化，所以prev还是新curr的prev）
 * 4. 返回pseudoNode.next；
 * @author jony.huang
 * @date 2020/7/17 9:48
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        //1. 设置虚拟节点pseudoNode，在链表删除节点时，利用虚拟节点比较容易删除head节点。
        ListNode pseudoNode = new ListNode(0, head);
        //2. 设置prev和curr两个指针
        ListNode prev = pseudoNode;
        ListNode curr = head;
        //3. 遍历链表将节点等于 val删掉
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                //链表变更，只将curr下移，prev不动，因为链表删除一个节点后curr发生变化，所以prev还是新curr的prev
                curr = curr.next;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }
        return pseudoNode.next;
    }

}
