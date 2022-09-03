package com.learn.google;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/5/19
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintTwoNumberThatAreUniqueInArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    while (input > 0) {
      int N = scanner.nextInt();
      N = N * 2 + 2;
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = scanner.nextInt();
      }
      Map<Integer, Integer> map = new HashMap<>();
      for (int i : arr) {
        if (map.containsKey(i)) {
          map.remove(i);
        } else {
          map.put(i, i);
        }
      }
      int[] out = new int[2];
      int i = 0;
      for (Entry<Integer, Integer> entry : map.entrySet()) {
        out[i] = entry.getKey();
        i++;
      }
      if (out[0] < out[1]) {
        System.out.println(out[0] + " " + out[1]);
      } else {
        System.out.println(out[1] + " " + out[0]);
      }
      input--;
    }
  }
}
