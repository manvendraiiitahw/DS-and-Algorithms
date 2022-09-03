package com.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        firstMissingPositive(arr);
    }

    public static int firstMissingPositive(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int i : arr) {
            m.put(i, i);
//            if()

        }
//        int min = 1;
//
//        for (int i=0;i<arr.length;i++) {
//            if()
//        }

        return 0;
    }
}
