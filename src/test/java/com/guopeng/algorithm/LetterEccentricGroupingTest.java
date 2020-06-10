package com.guopeng.algorithm;

import org.junit.Test;

import java.util.List;

/**
 * @author jony.huang
 * @date 2020/6/6 16:50
 */
public class LetterEccentricGroupingTest {


    LetterEccentricGrouping letterEccentricGrouping = new LetterEccentricGrouping();
    LetterEccentricGrouping_02 letterEccentricGrouping_02 = new LetterEccentricGrouping_02();

    @Test
    public void groupAnagrams() {
//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> result = letterEccentricGrouping.groupAnagrams(strs);
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = letterEccentricGrouping_02.groupAnagrams(strs);
        System.out.println(1);
    }
}