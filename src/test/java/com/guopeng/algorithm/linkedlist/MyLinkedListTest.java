package com.guopeng.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * @author jony.huang
 * @date 2020/7/2 19:46
 */
public class MyLinkedListTest {

    MyLinkedList myLinkedList = new MyLinkedList();

    @Test
    public void test() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        Assert.assertEquals(2,linkedList.get(1));            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        Assert.assertEquals(3,linkedList.get(1));
    }

    @Test
    public void test1() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.deleteAtIndex(0);
    }

    @Test
    public void test2() {
        MyLinkedList linkedList = new MyLinkedList();
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

}