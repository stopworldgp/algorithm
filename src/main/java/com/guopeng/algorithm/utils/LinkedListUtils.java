package com.guopeng.algorithm.utils;

import com.guopeng.algorithm.linkedlist.ListNode;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/18 10:23
 */
public class LinkedListUtils {

    public static void println(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
