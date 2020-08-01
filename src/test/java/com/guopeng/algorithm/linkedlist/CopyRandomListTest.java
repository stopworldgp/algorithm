package com.guopeng.algorithm.linkedlist;

import com.guopeng.algorithm.utils.LinkedListUtils;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/8/1 16:53
 */
public class CopyRandomListTest {

    @Test
    public void copyRandomList() {
        CopyRandomList copyRandomList = new CopyRandomList();
        CopyRandomList.Node node1 = new CopyRandomList.Node(1);
        CopyRandomList.Node node2 = new CopyRandomList.Node(2);

        node1.next = node2;
        node1.random = node1;
        node2.random = node1;

        CopyRandomList.Node actual = copyRandomList.copyRandomList(node1);
        LinkedListUtils.println(actual);

    }
}