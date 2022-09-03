package com.learn.hashmap;// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.util.stream.Collectors;


public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(hasArrayTwoCandidates(arr, 8, 1));

    }

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        boolean findStatus = false;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                map.put(arr[i], map.get(arr[i]) - 1);
            } else {
                map.remove(arr[i]);
            }
            if (map.containsKey(x - arr[i])) {
                findStatus = true;
                break;
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return findStatus;
    }
}