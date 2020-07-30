package com.guopeng.algorithm.lookupdate;

import com.guopeng.algorithm.lookuptable.Isomorphic;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author theone
 * @Date 2020/5/1 12:40
 * @Version 1.0
 */
public class IsomorphicTest {


    private Isomorphic isomorphic = new Isomorphic();

    @Test
    public void isIsomorphic() {

        Assert.assertTrue( isomorphic.isIsomorphic("egg","add"));

        Assert.assertFalse( isomorphic.isIsomorphic("foo","bar"));

        Assert.assertTrue( isomorphic.isIsomorphic("paper","title"));
    }
}
