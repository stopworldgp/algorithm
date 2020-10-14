package com.guopeng.algorithm.company.bytedance;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/problems/lru-cache-lcci/
 * 题目： LRU缓存
 * 解题思路：
 * 1.直接利用LinkedHashMap
 * 2.双链表加hashmap(属性 hashmap，head,tail 都给予赋值()，写一个moveToTail方法，每次访问都把节点放在最后)
 *
 * @author jony.huang
 * @date 2020/10/14 19:52
 */
public class LRUCache {

    int capacity = 0;
    private Map<Integer, Integer> linkedHashMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        int size = capacity + capacity / 3;
        linkedHashMap = new LinkedHashMap(size, 0.75f, true);
    }

    public int get(int key) {
        return linkedHashMap.get(key);
    }

    public void put(int key, int value) {
        if (linkedHashMap.size() >= capacity) {
            linkedHashMap.remove(linkedHashMap.entrySet().iterator().next().getKey());
        } else {
            linkedHashMap.put(key, value);
        }
    }
}
