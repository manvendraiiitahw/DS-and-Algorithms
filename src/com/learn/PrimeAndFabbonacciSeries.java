package com.learn;

public class PrimeAndFabbonacciSeries {
  public static void main(String[] args) {
    int n = 50;
    int a = 0, b = 1;
    int c = a + b;
    System.out.print(b + ",2,");
    for (int i = 3; i < n; ) {
      System.out.print(c + ",");
      a = b;
      b = c;
      c = a + b;
      while (i < n) {
        if (findNextPrime(i) > 0) {
          System.out.print(i+",");
          i++;
          break;
        } else {
          i++;
        }
      }
    }
  }

  static int findNextPrime(int a) {
    boolean prime = true;
    for (int j = 2; j <= a / 2; j++) {
      if (a % j == 0) {
        prime = false;
        break;
      }
    }
    if (prime) {
      return a;
    } else {
      return 0;
    }
  }
}
