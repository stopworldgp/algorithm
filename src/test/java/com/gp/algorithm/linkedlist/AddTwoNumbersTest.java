package com.gp.algorithm.linkedlist;

import com.gp.algorithm.utils.LinkedListUtils;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/7/23 9:55
 */
public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        ListNode l23 = new ListNode(4, null);
        ListNode l22 = new ListNode(6, l23);
        ListNode l21 = new ListNode(5, l22);

        ListNode node = atn.addTwoNumbers(l1,l21);
        LinkedListUtils.println(node);
    }
    @Test
    public void addTwoNumbers01() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = new ListNode(5, null);

        ListNode l2 = new ListNode(5, null);

        ListNode node = atn.addTwoNumbers(l1,l2);
        LinkedListUtils.println(node);
    }

    @Test
    public void addTwoNumbers02() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l12 = new ListNode(8, null);
        ListNode l1 = new ListNode(1, l12);

        ListNode l2 = new ListNode(0, null);

        ListNode node = atn.addTwoNumbers(l1,l2);
        LinkedListUtils.println(node);
    }
}