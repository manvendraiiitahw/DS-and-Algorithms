package com.learn.booking;

public class Subset_sum
{
  static int countStrings(int n)
  {
    int a[] = new int [n];
    int b[] = new int [n];
    a[0] = b[0] = 1;
    for (int i = 1; i < n; i++)
    {
      a[i] = a[i-1] + b[i-1];
      b[i] = a[i-1];
    }
    return a[n-1] + b[n-1];
  }
  /* Driver program to test above function */
  public static void main (String args[])
  {
    System.out.println(countStrings(2));
    System.out.println(countStrings(4));
    System.out.println(countStrings(5));
    System.out.println(countStrings(6));
    System.out.println(countStrings(7));
    System.out.println(countStrings(2));
  }
}/* This code is contributed by Rajat Mishra */
