package com.guopeng.algorithm.company.bytedance;

/**
 * 题目：
 * 用单向链表表示十进制整数，求两个正整数的和。如，1234+34=1268，注意单项链表的方向从前向后，不允许使用其他数据结构。
 *
 * //1.反转链表
 * //2.新结果->pre pre= 新结果
 * @Author theone
 * @Date 2020/10/11 17:12
 * @Version 1.0
 */
public class SingleLinked {

    public Node sum(Node node1, Node node2) {
        //1.反转链表两个链表
        node1 = reverseLinkedList(node1);
        node2 = reverseLinkedList(node2);
        //2.相加 生成新的链表
        Node cur1 = node1;
        Node cur2 = node2;
        Node head = null;
        int sum = 0;
        while (cur1 != null || cur2 != null) {
            if(cur1 != null){
                sum += cur1.value;
                cur1 = cur1.next;
            }
            if(cur2 != null){
                sum+= cur2.value;
                cur2 = cur2.next;
            }
            Node node =  new Node(sum%10);
            node.next = head;
            head = node;
            sum = sum/10;
        }
        return head;
    }

    /**
     * 反转链表
     * 思路：
     * 设置 pre 和cur
     * 先临时保持pre的下一个节点
     * 每次 pre ->cur,两个指针向前移
     * pre指向保存的临时节点
     *
     * @param node
     * @return
     */
    private Node reverseLinkedList(Node node) {
        Node pre = node;
        Node cur = null;
        while (pre != null) {
            Node t = pre.next;
            pre.next = cur;
            cur = pre;
            pre = t;
        }
        return cur;
    }


    static class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }


}
