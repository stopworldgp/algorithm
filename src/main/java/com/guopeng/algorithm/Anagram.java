package com.guopeng.algorithm;


/**
 * 效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
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
