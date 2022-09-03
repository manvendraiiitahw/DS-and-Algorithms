package com.learn.ds;

import java.util.HashMap;
import java.util.Map;

public class KeyPair {
    public static void main(String[] args) {
        KeyPair keyPair = new KeyPair();
        int[] arr = {1, 2, 4, 3, 6};
        System.out.println(keyPair.hasArrayTwoCandidates(arr, 5, 10));
    }

    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        if (arr.length == 0) {
            return false;
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        if (m.containsKey(x / 2)) {
            if (m.get(x / 2) >= 2) {
                return true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (m.containsKey(x - arr[i]) && x - arr[i] != x / 2) {
                return true;
            }
        }
        return false;
    }
}
