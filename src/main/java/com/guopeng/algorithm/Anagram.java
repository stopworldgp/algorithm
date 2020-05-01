package com.guopeng.algorithm;


/**
 * 异位词
 *
 * @Author theone
 * @Date 2020/5/1 11:33
 * @Version 1.0
 */
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if(s ==null||t==null || s.length()!=t.length()){
            return false;
        }
        int[] statistics = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            statistics[s.charAt(i)-'a']++;
            statistics[t.charAt(i)-'a']--;
        }
        for(int i : statistics){
            if(i!=0){
                return false;
            }
        }
        return true;
    }


}
