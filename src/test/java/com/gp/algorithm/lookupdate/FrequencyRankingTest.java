package com.gp.algorithm.lookupdate;

import com.gp.algorithm.lookuptable.FrequencyRanking;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jony.huang
 * @date 2020/5/6 20:07
 */
public class FrequencyRankingTest {

    private FrequencyRanking frequencyRanking = new FrequencyRanking();

    @Test
    public void frequencySort() {
        Assert.assertEquals("eert", frequencyRanking.frequencySort("tree"));
    }
}
