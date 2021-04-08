package com.gp.algorithm.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/8/21 9:45
 */
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String expect = "fl";
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void longestCommonPrefix01() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String expect = "";
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void longestCommonPrefix02() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"aa","a"};
        String expect = "a";
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(expect,actual);
    }

    //分治法
    @Test
    public void longestCommonPrefix03() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String expect = "fl";
        String actual = longestCommonPrefix.longestCommonPrefixByDac(strs);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void longestCommonPrefix04() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String expect = "";
        String actual = longestCommonPrefix.longestCommonPrefixByDac(strs);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void longestCommonPrefix05() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"aa","a"};
        String expect = "a";
        String actual = longestCommonPrefix.longestCommonPrefixByDac(strs);
        Assert.assertEquals(expect,actual);
    }
}