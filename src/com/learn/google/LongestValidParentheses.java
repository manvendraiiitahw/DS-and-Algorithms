package com.learn.google;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/6/19
 */

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      String str = sc.next();
      char[] input = str.toCharArray();
      Stack<Character> stack = new Stack<>();
      int i = 0;
      int res = 0;
      while (i < input.length) {
        if (stack.isEmpty() || input[i] == '(') {
          stack.push(input[i]);
        } else {
          res = res + 2;
          stack.pop();
        }
        i++;
      }
      System.out.println(res);

      t--;
    }
  }

}
//(((())(()()(()))))
//(((()))(((()()(())))))((()
