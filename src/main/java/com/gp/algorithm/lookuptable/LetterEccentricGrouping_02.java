package com.gp.algorithm.lookuptable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [力扣
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 *
 * @author jony.huang
 * @date 2020/6/8 9:39
 */
public class LetterEccentricGrouping_02 {

    public ArrayList groupAnagrams(String[] strs) {
        /*
        利用算术基本定理高效求解。
        算术基本定理：任何一个大于 1 的自然数，都可以写成一系列素数的乘积，且这个素数序列（这里以及下面提到的序列都是指不考虑元素顺序的序列）是唯一的。例如 12，只能分解为为 2，2，3 这三个素数的乘积，不可能存在其它素数序列的积为 12。
        根据这个定理，我们把 26 个小写字母一一映射到 26 个不同的素数上，那么每个字符串都可以看作是一个素数序列。由乘法的可交换性知，无论这个字符串的字母如何交换位置，其对应的素数序列的乘积都是不变的。最重要的是，两个由不同字母序列组成的字符串对应的乘积值一定是不同的，绝对没有发生冲突的可能性。
         */
        int[] letter = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int initialCapacity = (int) ((float) strs.length / 0.75f + 1);
        Map<Long, List<String>> map = new HashMap<>(initialCapacity);
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Long key = 1L;
            for (int j = 0; j < chars.length; j++) {
                key = key * letter[(chars[j] - 'a')];
            }
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        return new ArrayList(map.values());
    }


}
