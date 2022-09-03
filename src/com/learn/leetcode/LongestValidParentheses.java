package com.learn.leetcode;

import java.util.Objects;
import java.util.Stack;
//https://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }

    public static int longestValidParentheses(String s) {
        if (Objects.nonNull(s) && s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int i = 0, output = Integer.MIN_VALUE;
        while (i < s.length()) {
            if (s.charAt(i) == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    output = Math.max(output, i - stack.peek());
                }else {
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
            i++;
        }
        return output;
    }
}
