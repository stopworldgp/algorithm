package com.guopeng.algorithm;

import org.junit.Test;

import java.util.List;

/**
 * @author jony.huang
 * @date 2020/6/6 16:50
 */
public class LetterEccentricGroupingTest {


    LetterEccentricGrouping letterEccentricGrouping = new LetterEccentricGrouping();

    @Test
    public void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = letterEccentricGrouping.groupAnagrams(strs);
        System.out.println(1);
    }
}