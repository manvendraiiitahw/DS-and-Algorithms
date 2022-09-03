package com.learn.booking;

public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    String str = "babad";
    char[] inp = str.toCharArray();

    int[][] temp = new int[inp.length + 1][inp.length + 1];
    for (int j = inp.length; j > 0; j--) {
      for (int i = 1; i <= inp.length; i++) {
        if (inp[i - 1] == inp[j - 1]) {
          temp[inp.length - j + 1][i] = temp[i - 1][j - 1] + 1;
        }
      }
    }

    System.out.println(temp);

  }
}
