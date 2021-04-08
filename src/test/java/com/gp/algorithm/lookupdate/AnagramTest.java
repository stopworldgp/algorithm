package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.Anagram;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/5/1 11:39
 * @Version 1.0
 */
public class AnagramTest {

    private Anagram eccentric = new Anagram();

    @Test
    public void isAnagram() {
        String s="anagram";
        String t="nagaram";
        Assert.assertTrue( eccentric.isAnagram(s,t));


        String s1="rat";
        String t1="cat";
        Assert.assertFalse( eccentric.isAnagram(s1,t1));
    }
}
