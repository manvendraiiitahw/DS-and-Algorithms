package com.learn;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyProblem {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
//    6AM#8AM
//    11AM#1PM
//    7AM#3PM
//    7AM#10AM
//    10AM#12PM
//    2PM#4PM
//    1PM#4PM
//    8AM#9AM
    int[] start = new int[t];
    int[] depart = new int[t];
    int i = 0;
    while (t > 0) {
      String s = scanner.next();
      String[] str = s.split("#");
      int a = Integer.parseInt(String.valueOf(str[0].charAt(0)));
      if ((str[0].charAt(1) > 47) && (str[0].charAt(1) < 58)) {
        a = a * 10 + Integer.valueOf(String.valueOf(str[0].charAt(1)));
      }
      start[i] = a;
      int b = Integer.parseInt(String.valueOf(str[1].charAt(0)));
      if ((str[1].charAt(1) > 47) && (str[1].charAt(1) < 58)) {
        b = b * 10 + Integer.valueOf(String.valueOf(str[1].charAt(1)));
      }
      depart[i] = b;

      i++;
      t--;
    }
    Arrays.sort(start);
    Arrays.sort(depart);
    int x = 1;
    int output = 0;
    for (int j = 0; j < start.length; j++) {

      // if overlap -> increase the room number
      if (depart[j] > start[j]) {
        x++;
      }

      // at any point, if x exceeds total room
      // in the hotel, return false
      if (x > 1) {
        output = output + 500;
        x=1;
      }
    }

    System.out.println(output);

  }
}
