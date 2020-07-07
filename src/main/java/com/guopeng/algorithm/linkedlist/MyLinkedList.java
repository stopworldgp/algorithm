package com.guopeng.algorithm.linkedlist;

/**
 * 来源:https://leetcode-cn.com/explore/learn/card/linked-list/193/singly-linked-list/741/
 * 设计链表
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * <p>
 * 在链表类中实现这些功能：
 * <p>
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 * <p>
 * <p>
 * 示例：
 * <p>
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 * linkedList.get(1);            //返回2
 * linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 * linkedList.get(1);            //返回3
 * <p>
 * <p>
 * 提示：
 * <p>
 * 所有val值都在 [1, 1000] 之内。
 * 操作次数将在  [1, 1000] 之内。
 * 请不要使用内置的 LinkedList 库。
 * <p>
 * 解题思路：
 * 1.new MyLinkedList 实现 一个head 头节点(null)和 tail尾结点(null)，指向同一个null
 * 2.addAtHead  如果 头尾都是null 则 head指向 新节点
 * 3.addAtHead  如果 头节点不为null，则 新节点-> head. head ->新节点
 * 4.addAtTail 尾结点 同理
 * 5.get 遍历 遍历到null 返 -1
 * 6.addAtIndex   遍历到 越界不插入，不越界， ①先让新节点指向 原index节点，再让 index-1 节点指向新节点
 * 7.deleteAtIndex  遍历到 越界不删除，不越界， ①让 index-1 节点指向 index+1节点
 *
 * @author jony.huang
 * @date 2020/7/1 9:39
 */
public class MyLinkedList {

    private Node head;

    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.head = new Node(0, null);
        this.size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node tmp = getNode(index + 1);
        return tmp.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        Node tmp = getNode(index);
        Node node = new Node(val, null);
        node.next = tmp.next;
        tmp.next = node;
        size++;
    }

    private Node getNode(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node tmp = getNode(index);
        tmp.next = tmp.next.next;
        size--;
    }

    private class Node {

        public int val;

        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
