package com.guopeng.algorithm.company.bytedance;

import com.guopeng.algorithm.company.bytedance.SingleLinked.Node;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/10/11 17:48
 * @Version 1.0
 */
public class SingleLinkedTest {

    SingleLinked singleLinked = new SingleLinked();

    @Test
    public void sum() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node cur1 = node1;

        Node node5 = new Node(5);

        Node node6 = new Node(6);
        node5.next = node6;
        Node cur2 = node5;

        Node node = singleLinked.sum(cur1, cur2);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }


    }
}