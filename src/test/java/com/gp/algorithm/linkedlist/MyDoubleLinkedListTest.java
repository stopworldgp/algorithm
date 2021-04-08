package com.gp.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/21 10:36
 */
public class MyDoubleLinkedListTest {


    @Test
    public void test() {
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        Assert.assertEquals(2, linkedList.get(1));            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        Assert.assertEquals(3, linkedList.get(1));
    }

    @Test
    public void test1() {
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList();
        linkedList.addAtHead(1);
        linkedList.deleteAtIndex(0);
    }

    @Test
    public void test2() {
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3,0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        linkedList.get(4);
        linkedList.addAtHead(4);
        linkedList.addAtIndex(5,0);
        linkedList.addAtHead(6);

        linkedList.deleteAtIndex(0);
    }

    @Test
    public void test4() {
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtTail(7);

        linkedList.addAtHead(9);
        linkedList.addAtTail(8);

        linkedList.addAtHead(6);
        linkedList.addAtHead(0);
        int actual =  linkedList.get(5);
        Assert.assertEquals(8,actual);

        linkedList.addAtHead(0);
        actual = linkedList.get(2);
        Assert.assertEquals(6,actual);
        actual =  linkedList.get(5);
        Assert.assertEquals(7,actual);
        linkedList.addAtTail(4);
    }

}