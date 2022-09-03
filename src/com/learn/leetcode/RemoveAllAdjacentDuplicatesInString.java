package com.learn.leetcode;

//You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
// We repeatedly make k duplicate removals on s until we no longer can.
//        Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(RemoveAllAdjacentDuplicatesInString.removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4));
    }

    public static String removeDuplicates(String s, int k) {
        if (s == null || s.length() < k) {
            return s;
        }
        Stack<Character> stack1 = new Stack<>();
        Stack<Integer> freq = new Stack<>();
        stack1.push(s.charAt(0));
        freq.add(1);
        for (int i = 1; i < s.length(); i++) {
            if (!freq.isEmpty() && freq.peek() == k) {
                stack1.pop();
                freq.pop();
            }
            if (!stack1.isEmpty() && stack1.peek().equals(s.charAt(i))) {
                int t = freq.pop();
                freq.push(t + 1);
            } else {
                stack1.push(s.charAt(i));
                freq.push(1);
            }

        }
        if (!freq.isEmpty() && freq.peek() == k) {
            stack1.pop();
            freq.pop();
        }
        StringBuilder out = new StringBuilder();
        while (!stack1.isEmpty()) {
            char c = stack1.pop();
            int fre = freq.pop();
            out.append(String.valueOf(c).repeat(Math.max(0, fre)));
        }
        out.reverse();

        return out.toString();
    }
}
