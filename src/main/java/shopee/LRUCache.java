package shopee;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 来源：https://leetcode-cn.com/problems/lru-cache/
 * 题目： LRU 缓存机制
 * 解题思路：继承LinkedHashMap，重写removeEldestEntry方法removeEldestEntry，size() > capacity
 *
 *
 * @author jony.huang
 * @date 2021/3/30 16:06
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

}

