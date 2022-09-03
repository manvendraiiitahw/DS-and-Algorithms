package com.learn.google;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/5/19
 */

import java.util.Scanner;

public class ContinuousSubArrayWithGivenSum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    while (input > 0) {
      int N = scanner.nextInt();
      int sum = scanner.nextInt();
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = scanner.nextInt();
      }
      int j = 0;
      int curr_sum = arr[0];
      for (int i = 1; i < N; ) {
        if (curr_sum < sum) {
          curr_sum = curr_sum + arr[i];
          i++;
        }
        if (curr_sum > sum) {
          curr_sum = curr_sum - arr[j];
          j++;
        }
        if (curr_sum == sum) {
          System.out.println(j + " and " + --i);
          break;
        }
      }
      if(curr_sum!=sum){
        System.out.println("-1");
      }
      input--;
    }
  }
}
