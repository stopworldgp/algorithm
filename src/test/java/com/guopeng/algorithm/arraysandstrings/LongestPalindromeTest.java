package com.guopeng.algorithm.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/8/25 11:02
 */
public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome = new LongestPalindrome();


    @Test
    public void longestPalindrome() {
        String s = "babad";
        String expect = "bab";
        String actual = longestPalindrome.longestPalindrome(s);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void longestPalindrome01() {
        String s = "cbbd";
        String expect = "bb";
        String actual = longestPalindrome.longestPalindrome(s);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void longestPalindrome02() {
        String s = "ac";
        String expect = "a";
        String actual = longestPalindrome.longestPalindrome(s);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void longestPalindrome03() {
        String s = "bb";
        String expect = "bb";
        String actual = longestPalindrome.longestPalindrome(s);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void longestPalindrome04() {
        String s = "ccc";
        String expect = "ccc";
        String actual = longestPalindrome.longestPalindrome(s);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void longestPalindrome05() {
        String s = "aaaa";
        String expect = "aaaa";
        String actual = longestPalindrome.longestPalindrome(s);
        Assert.assertEquals(expect, actual);
    }

}