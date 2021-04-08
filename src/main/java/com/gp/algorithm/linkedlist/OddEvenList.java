package com.gp.algorithm.linkedlist;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/195/classic-problems/753/
 * 题目：奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 * <p>
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 * <p>
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 * 解题思路：
 * 拿 ”1到5“和 “1到4”举例，便于思考解题思路
 * 1.设置奇偶数指针，偶数链表头,奇数表头就是head
 * 2.遍历链表，使对应节点落到对应的表头下边；
 * 3.奇数链表的下一个就是偶数节点的下一个
 * 4.变更奇数指针
 * 5.偶数指针就是奇数指针的下一个
 * 6.变更偶数指针
 * 7.将奇数指针指向偶数链表头节点
 * 8.返回头节点也就是技术点
 *
 *
 * @author jony.huang
 * @date 2020/7/18 10:13
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {

        //1.设置奇偶数指针，偶数链表头,奇数表头就是head
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        //2.遍历链表，使对应节点落到对应的表头下边；
        while (even != null&& even.next !=null) {
            //3.奇数链表的下一个就是偶数节点的下一个
            odd.next = even.next;
            //4.变更奇数指针
            odd = odd.next;
            //5.偶数指针就是奇数指针的下一个
            even.next = odd.next;
            //6.变更偶数指针
            even = even.next;
        }
        //7.将奇数指针指向偶数链表头节点
        odd.next = evenHead;
        //8.返回头节点也就是技术点
        return head;
    }
}
