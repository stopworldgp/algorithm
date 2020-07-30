package com.guopeng.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/7/18 17:57
 */
public class IsPalindromeTest {

    IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void isPalindromeArrayMethod() {
        ListNode l4 = new ListNode(1, null);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        boolean actual = isPalindrome.isPalindromeArrayMethod(l1);
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindromeReverseMethod() {
        ListNode l4 = new ListNode(1, null);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        boolean actual = isPalindrome.isPalindromeReverseMethod(l1);
        Assert.assertTrue(actual);
    }
}