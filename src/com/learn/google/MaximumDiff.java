package com.learn.google;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/5/19
 */

import java.util.Scanner;

//Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].
public class MaximumDiff {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    while (input > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      int[] Lmin = new int[n];
      int[] Rmax = new int[n];
      Lmin[0] = arr[0];
      for (int i = 1; i < n; i++) {
        Lmin[i] = Math.min(arr[i], Lmin[i - 1]);
      }
      Rmax[n - 1] = arr[n - 1];
      for (int i = n - 2; i >= 0; i--) {
        Rmax[i] = Math.max(arr[i], Rmax[i + 1]);
      }
      int i = 0, j = 0, maxDiff = -1;
      while (i < n && j < n) {
        if (Lmin[i] < Rmax[j]) {
          maxDiff = Math.max(maxDiff, j - i);
          j = j + 1;
        } else {
          i = i + 1;
        }


      }
      System.out.println(maxDiff);


      input--;
    }

  }
}
