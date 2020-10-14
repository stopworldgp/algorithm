package com.guopeng.algorithm.company.bytedance;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/problems/lru-cache-lcci/
 * 题目： LRU缓存
 * 解题思路：
 * 1.直接利用LinkedHashMap
 * 2.双链表加hashmap(属性 hashmap，head,tail 都给予赋值()，写一个moveToTail方法，每次访问都把节点放在最后,)
 *
 * @author jony.huang
 * @date 2020/10/14 19:52
 */
public class LRUCache {

    int capacity;
    Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>((int)((float)capacity / 0.75f + 1.0f), 0.75f, true);
    }

    public int get(int key)
    {
        Integer value = map.get(key);
        if (value == null)
            return -1;
        return value;
    }


    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > capacity) {
            map.remove(map.entrySet().iterator().next().getKey());
        }
    }
}
