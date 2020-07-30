package com.guopeng.algorithm.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jony.huang
 * @date 2020/7/28 9:37
 */
@AllArgsConstructor
public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
       this.val = val;
    }

}
