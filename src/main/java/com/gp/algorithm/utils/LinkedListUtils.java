package com.gp.algorithm.utils;

import com.gp.algorithm.linkedlist.ListNode;
import com.gp.algorithm.linkedlist.CopyRandomList;
import com.gp.algorithm.linkedlist.Node;


/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/18 10:23
 */
public class LinkedListUtils {

    public static void println(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static void println(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static void println(CopyRandomList.Node head) {
        CopyRandomList.Node curr = head;
        while (curr != null) {
            String s = null;
            if (curr.random != null) {
                s = "[" + curr.val + "," + curr.random.val + "]";
            } else {
                s = "[" + curr.val + "," + "null" + "]";
            }
            System.out.println(s);
            curr = curr.next;
        }
    }

    public static void println(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
