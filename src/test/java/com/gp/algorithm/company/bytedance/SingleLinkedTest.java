package com.gp.algorithm.company.bytedance;

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
        SingleLinked.Node node1 = new SingleLinked.Node(1);
        SingleLinked.Node node2 = new SingleLinked.Node(2);
        SingleLinked.Node node3 = new SingleLinked.Node(3);
        SingleLinked.Node node4 = new SingleLinked.Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        SingleLinked.Node cur1 = node1;

        SingleLinked.Node node5 = new SingleLinked.Node(5);

        SingleLinked.Node node6 = new SingleLinked.Node(6);
        node5.next = node6;
        SingleLinked.Node cur2 = node5;

        SingleLinked.Node node = singleLinked.sum(cur1, cur2);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }


    }
}