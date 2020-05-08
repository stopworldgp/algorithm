package com.guopeng.algorithm;

/**
 * 根据字符出现频率排序
 * <p>
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * 示例 1:
 * <p>
 * 输入:
 * "tree"
 * <p>
 * 输出:
 * "eert"
 * <p>
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 *
 * @author jony.huang
 * @date 2020/5/6 19:52
 */
public class FrequencyRanking {

    public String frequencySort(String s) {
        if(s == null){
            return s;
        }
        int[] chars = new int[128];
        char[] cs =  s.toCharArray();
        for (char c :cs) {
            chars[c] = chars[c] + 1;
        }
        int index = 0;
        String result = "";
        while (index < s.length()) {
            int maxValue = 0;
            char c = 0;
            for (int i = 0; i <= 'z'; i++) {
                if (chars[i] > maxValue) {
                    maxValue = chars[i];
                    c = (char) i;
                }
            }
            chars[c] = 0;
            while(maxValue-->0){
                cs[index++] = c;
            }
        }
        return new String(cs);
    }

}
