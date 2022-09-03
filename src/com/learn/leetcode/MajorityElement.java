package com.learn.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i] = scanner.nextInt();
                i++;
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                } else {
                    map.put(arr[j], 1);
                }
            }
            boolean isPrinted=false;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > n / 2) {
                    System.out.println(entry.getKey());
                    isPrinted=true;
                    break;
                }
            }
            if(!isPrinted){
                System.out.println(-1);
            }


            t--;
        }
    }
}
