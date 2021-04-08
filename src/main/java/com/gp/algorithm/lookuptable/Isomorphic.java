package com.gp.algorithm.lookuptable;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 *
 * @Author theone
 * @Date 2020/5/1 12:35
 * @Version 1.0
 */
public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                if (tMap.containsKey(t.charAt(i))) {
                    return false;
                } else {
                    sMap.put(s.charAt(i), t.charAt(i));
                    tMap.put(t.charAt(i), s.charAt(i));
                }
            } else {
                if (!sMap.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

}
