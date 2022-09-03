package com.learn.ds;

public class RecursiveStairCaseProblem {
  public static void main(String[] args) {
    System.out.println(System.currentTimeMillis());
    System.out.println(count(30));
    System.out.println(System.currentTimeMillis());
    System.out.println(countDp(30));
    System.out.println(System.currentTimeMillis());
  }

  private static int count(int n) {
    if (n == 0 || n == 1) return 1;
    else {
      return count(n - 1) + count(n - 2);
    }
  }

  private static int countDp(int n) {
    int a = 1;
    int b = 1;
    int c;
    if (n == 0 || n == 1) {
      return 1;
    } else {
      for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
      }
    }
    return b;

  }
}
