package com.gp.algorithm.linkedlist;

import com.gp.algorithm.utils.LinkedListUtils;
import org.junit.Test;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/7/23 9:30
 */
public class MergeTwoAscendingListsTest {


    @Test
    public void mergeTwoLists() {
        MergeTwoAscendingLists m = new MergeTwoAscendingLists();
        ListNode l3 = new ListNode(4, null);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode l23 = new ListNode(4, null);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);
        ListNode actual =  m.mergeTwoLists(l1,l21);
        LinkedListUtils.println(actual);
    }
}