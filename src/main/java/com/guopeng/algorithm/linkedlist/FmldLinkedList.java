package com.guopeng.algorithm.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 来源：https://leetcode-cn.com/explore/learn/card/linked-list/197/conclusion/764/
 * 题目：扁平化多级双向链表
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 * <p>
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * 输出：[1,2,3,7,8,11,12,9,10,4,5,6]
 * 解释：
 * <p>
 * 输入的多级列表如下图所示：
 * <p>
 * 扁平化后的链表如下图：
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [1,2,null,3]
 * 输出：[1,3,2]
 * 解释：
 * <p>
 * 输入的多级列表如下图所示：
 * <p>
 * 1---2---NULL
 * |
 * 3---NULL
 * 示例 3：
 * <p>
 * 输入：head = []
 * 输出：[]
 * <p>
 * <p>
 * 如何表示测试用例中的多级链表？
 * <p>
 * 以 示例 1 为例：
 * <p>
 * 1---2---3---4---5---6--NULL
 * |
 * 7---8---9---10--NULL
 * |
 * 11--12--NULL
 * 序列化其中的每一级之后：
 * <p>
 * [1,2,3,4,5,6,null]
 * [7,8,9,10,null]
 * [11,12,null]
 * 为了将每一级都序列化到一起，我们需要每一级中添加值为 null 的元素，以表示没有节点连接到上一级的上级节点。
 * <p>
 * [1,2,3,4,5,6,null]
 * [null,null,7,8,9,10,null]
 * [null,11,12,null]
 * 合并所有序列化结果，并去除末尾的 null 。
 * <p>
 * [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 节点数目不超过 1000
 * 1 <= Node.val <= 10^5
 * 解题思路：
 * 1. 将列表90度旋转，其实类似二叉树，这样就可以模拟二叉树的前序遍历，来完成扁平化操作
 * 2. 采用stack的方式，进行压栈，先进后出，每次遍历先压进去curr.next再压进去curr.child，这样下次就会弹出child，先将child遍历完，再继续curr.next
 *
 * @author jony.huang
 * @date 2020/7/28 9:35
 */
public class FmldLinkedList {

    /**
     * 采用Stack方式
     *
     * @param head
     * @return
     */
    public Node flattenStack(Node head) {
        if (head == null) {
            return null;
        }
        Deque<Node> stack = new ArrayDeque<>();
        Node prevNode = new Node(-1, null, head, null);
        stack.push(head);
        Node curr, prev = prevNode;
        while (!stack.isEmpty()) {
            curr = stack.pop();

            prev.next = curr;
            curr.prev = prev;
            if (curr.next != null) {
                stack.push(curr.next);
            }
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        prevNode.next.prev = null;
        return prevNode.next;
    }

    /**
     * 采用递归方式实现
     *
     * @param head
     * @return
     */
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node prevNode = new Node(0, null, head, null);
        flattenDFS(prevNode, head);
        prevNode.next.prev = null;
        return prevNode.next;
    }

    //类似先序遍历
    private Node flattenDFS(Node prev, Node curr) {
        if (curr == null) {
            return prev;
        }
        //类似先遍历出跟节点
        prev.next = curr;
        curr.prev = prev;

        Node tempNext = curr.next;
        //类似遍历二叉树的左子树
        Node tail = flattenDFS(curr, curr.child);
        curr.child = null;
        //类似遍历二叉树的右子树
        return flattenDFS(tail, tempNext);
    }
}
