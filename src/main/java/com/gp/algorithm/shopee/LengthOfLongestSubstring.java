package com.gp.algorithm.shopee;

import java.util.HashMap;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/solution/mian-shi-ti-48-zui-chang-bu-han-zhong-fu-zi-fu-d-9/
 * 题目： 最长不含重复字符的子字符串
 * 解题思路：
 * 双指针 + 哈希表
 *
 * @author jony.huang
 * @date 2021/4/10 13:58
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //记录字符坐标
        Map<Character,Integer> map = new HashMap<>();
        int res =0;
        int i=-1;
        for (int j = 0; j < s.length(); j++) {
            //更新左指针
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j)));
            }
            //加入map
            map.put(s.charAt(j),j);
            //比较长度
            res = Math.max(res,j-i);
        }
        return res;
    }
}
