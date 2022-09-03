package com.learn.booking;

import java.util.Scanner;

public class Test1111 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = 4;
    while (input > 0) {
      int hop = sc.nextInt();
      int output = 0;
      for (int i = 1; i <= hop; i++) {
        if (i % 3 == 1) {
          output = output + 20;
        } else if (i % 3 == 2) {
          output = output + 10;
        } else {
          output = output + 5;
        }
      }
      System.out.println(output);
      input--;
    }
  }
}
