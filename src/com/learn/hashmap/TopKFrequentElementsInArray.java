package com.learn.hashmap;

import java.util.*;

public class TopKFrequentElementsInArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4};
        System.out.println(TopKFrequentElementsInArray.findTopK(nums, 2));
    }

    static int[] findTopK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o2.getValue() - o1.getValue() > 0) {
                    return o2.getValue() - o1.getValue();
                } else if (o2.getValue() - o1.getValue() == 0) {
                    return o2.getKey() - o1.getKey();
                } else
                    return o2.getValue() - o1.getValue();
            }
        });
        int[] output = new int[k];
        if (list.size() < k) {
            return output;
        }
        for (int i = 0; i < k; i++) {
            output[i] = list.get(i).getKey();
        }
        return output;

    }

    public static int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {
        Map<Integer,Integer> map = new HashMap<>();
        if (n > m) {
            for (int j : b) {
                if (map.containsKey(j)) {
                    map.put(j, map.get(j) + 1);
                } else {
                    map.put(j, 1);
                }
            }
        } else {
            for (int j : a) {
                if (map.containsKey(j)) {
                    map.put(j, map.get(j) + 1);
                } else {
                    map.put(j, 1);
                }
            }
        }
        int count = 0;
        if (n > m) {
            count = getCount(a, map, count);
        } else {
            count = getCount(b, map, count);
        }
        return count;
    }
//    }
//        Map<Integer,Integer> map = new HashMap<>();
//        if (n > m) {
//            for (int j : b) {
//                if (map.containsKey(j)) {
//                    map.put(j, map.get(j) + 1);
//                } else {
//                    map.put(j, 1);
//                }
//            }
//        } else {
//            for (int j : a) {
//                if (map.containsKey(j)) {
//                    map.put(j, map.get(j) + 1);
//                } else {
//                    map.put(j, 1);
//                }
//            }
//        }
//        int count = 0;
//        if (n > m) {
//            count = getCount(a, map, count);
//        } else {
//            count = getCount(b, map, count);
//        }
//        return count;
//    }

    private static int getCount(int[] b, Map<Integer, Integer> map, int count) {
        for (int j : b) {
            if (map.containsKey(j)) {
                count++;
                if(map.get(j)>1){
                    map.put(j,map.get(j)-1);
                }else {
                    map.remove(j);
                }
            }
        }
        return count;
    }
}
