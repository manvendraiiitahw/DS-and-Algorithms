package com.learn;

import java.util.Scanner;

public class SwappingSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        int q = sc.nextInt();
        while (q > 0) {
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            l1--;
            r1--;
            r2--;
            l2--;
            i = 0;
            while (i < l1) {
                arr1[i] = arr[i];
                i++;
            }
            int j = l2;
            while (j <= r2) {
                arr1[i] = arr[j];
                i++;
                j++;
            }
            l2--;
            while (i <= l2) {
                arr1[i] = arr[i];
                i++;
            }
            while (l1 <= r1) {
                arr1[i] = arr[l1];
                i++;
                l1++;
            }
            while (i < n) {
                arr1[i] = arr[i];
                i++;
            }
            for (i = 0; i < n; i++) {
                arr[i] = arr1[i];
            }
            q--;
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
