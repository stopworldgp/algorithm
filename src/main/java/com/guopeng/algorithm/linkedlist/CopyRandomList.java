package com.guopeng.algorithm.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/leetbook/read/linked-list/fdi26/
 * 题目：复制带随机指针的链表
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * <p>
 * 要求返回这个链表的 深拷贝。 
 * <p>
 * 我们用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
 * <p>
 * val：一个表示 Node.val 的整数。
 * random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 示例 2：
 * <p>
 * 输入：head = [[1,1],[2,1]]
 * 输出：[[1,1],[2,1]]
 * 示例 3：
 * <p>
 * 输入：head = [[3,null],[3,0],[3,null]]
 * 输出：[[3,null],[3,0],[3,null]]
 * 示例 4：
 * <p>
 * 输入：head = []
 * 输出：[]
 * 解释：给定的链表为空（空指针），因此返回 null。
 *  
 * <p>
 * 提示：
 * <p>
 * -10000 <= Node.val <= 10000
 * Node.random 为空（null）或指向链表中的节点。
 * 节点数目不超过 1000
 * <p>
 * 解题思路：
 * 第一种办法
 * 1. 遍历head，将节点放入map(key原节点，value拷贝几点)，并new出拷贝节点(随机节点不变)
 * 2. 遍历新节链表，将随机指针指向拷贝节点
 * <p>
 * 第二种办法
 * 1. 拷贝一个新节点在就旧节点旁，形成一个这样的链表A->A'->B->B'
 * 2. 遍历新旧交叉链表，旧节点的random.next，就是其拷贝新节点的random
 *
 * @author jony.huang
 * @date 2020/8/1 13:37
 */
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        Node newHead = new Node(-1);
        Node prev = newHead;
        //1. 遍历head，将节点放入map(key原节点，value拷贝几点)，并new出拷贝节点(随机节点不变)
        while (curr != null) {
            Node newNode = new Node(curr.val);
            prev.next = newNode;
            newNode.next = curr.next;
            newNode.random = curr.random;
            map.put(curr, newNode);
            curr = curr.next;
            prev = newNode;
        }
        curr = newHead;
        //2.遍历新节链表，将随机指针指向拷贝节点
        while (curr != null) {
            curr.random = map.get(curr.random);
            curr = curr.next;
        }
        return newHead.next;
    }

    public Node copyRandomListNaon(Node head) {
        if (head == null) {
            return head;
        }
        //1. 拷贝一个新节点在就旧节点旁，形成一个这样的链表A->A'->B->B'
        Node curr = head;
        while (curr != null) {
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;
            curr = node.next;
        }
        //2.遍历新旧交叉链表，旧节点的random.next，就是其拷贝新节点的random
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                Node node = curr.next;
                node.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = curr.next;
        Node copyHead = curr.next;
        while (curr != null) {
            curr.next = curr.next.next;
            copyHead.next = (copyHead.next == null) ? null : copyHead.next.next;
            curr = curr.next;
            copyHead = copyHead.next;
        }
        return newHead;
    }

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
