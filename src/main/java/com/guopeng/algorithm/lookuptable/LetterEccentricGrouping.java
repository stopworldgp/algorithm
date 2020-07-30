package com.guopeng.algorithm.lookuptable;


import java.util.*;

/**
 *
 * 更优方法：https://www.jianshu.com/p/b50d790e9f76
 * 字母异位词分组
 *
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 说明：
 *
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 *
 * @author jony.huang
 * @date 2020/6/6 16:18
 */
public class LetterEccentricGrouping {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<Long, List<String>> map = new HashMap<>();
        //1.遍历strs
        for (int i = 0; i < strs.length; i++) {
            String strings = strs[i];
            char[] chars = strings.toCharArray();
            //2.重排序
//            Arrays.sort(chars);
            Long s2 = 1L;
            for (int j = 0; j < chars.length; j++) {
                int c = chars[j]-'a'+1;
                s2 = s2*c;
            }
//            String s2 =  new String(chars);
            if(map.containsKey(s2)){
                map.get(s2).add(strings);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strings);
                map.put(s2,list);
            }
        }

        //3.遍历map，求结果合并
        for (Map.Entry<Long, List<String>> integerListEntry : map.entrySet()) {
            result.add(integerListEntry.getValue());
        }
        return result;
    }

}
