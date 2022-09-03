package com.learn.booking;

public class SortStringWithOutAPI {
  public static void main(String[] args) {

    String inp = "a390testai";
//    O/P: 039aaiest

    int[] count = new int[256];
    for (int i = 0; i < inp.length(); i++) {
      count[inp.charAt(i)]++;
    }

    for (int i = 0; i < 256; i++) {
      if (count[i] == 1) {
        System.out.print((char) i);
      }
      if (count[i] > 1) {
        int j = count[i];
        while (j > 0) {
          System.out.print((char) i);
          j--;
        }
      }
    }
  }
}
