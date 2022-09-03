package advance.java.leetcode.subscription.neetcode.linkedlist;

import java.util.*;

public class LRUCache {
    List<Integer> linkedList = null;
    Map<Integer, Integer> integerIntegerMap = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        linkedList = new ArrayList<>(capacity);
    }

    public int get(int key) {
        int val = integerIntegerMap.getOrDefault(key, -1);
        if (val != -1) {
            linkedList.remove(0);
            linkedList.add(key);
        }
        return val;
    }

    public void put(int key, int value) {
        if (integerIntegerMap.containsKey(key)) {
            linkedList.remove(0);
        } else if (linkedList.size() == capacity) {
            int ele = linkedList.remove(0);
            integerIntegerMap.remove(ele);
        }
            linkedList.add(key);
            integerIntegerMap.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
//        ["LRUCache","put","put","put","put","get","get"]
//[         [2],        [2,1],[1,1],[2,3],[4,1],[1],[2]]
        lruCache.put(2, 1); // cache is {1=1}
        lruCache.put(1, 1); // cache is {1=1, 2=2}
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        System.out.println(lruCache.get(1));    // return 1
//        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lruCache.get(2));    // returns -1 (not found)
//        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        System.out.println(lruCache.get(1));    // return -1 (not found)
//        System.out.println(lruCache.get(3));    // return 3
//        System.out.println(lruCache.get(4));    // return 4
    }
}
