package com.guopeng.algorithm.linkedlist;

import com.guopeng.algorithm.utils.LinkedListUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/30 9:44
 */
public class FmldLinkedListTest {

    FmldLinkedList fmldLinkedList = new FmldLinkedList();

    @Test
    public void flatten() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node nn = null;
        Node n3 = new Node(3);

        n1.next = n2;
        n1.child = n3;
        n2.prev = n1;
        n2.next = nn;

        Node actual =fmldLinkedList.flatten(n1);
        LinkedListUtils.println(actual);
    }
}