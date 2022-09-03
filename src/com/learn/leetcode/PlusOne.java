package com.learn.leetcode;

import java.util.Stack;

public class PlusOne {
    public static void main(String[] args) {
        int[] a = {9,9,9,9};
        PlusOne plusOne = new PlusOne();
        plusOne.plusOne(a);
    }

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return digits;
        }

        Stack<Integer> integers = new Stack<>();
        int carry = 0;
        int curSum;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                curSum = digits[i] + carry + 1;
            } else {
                curSum = digits[i] + carry;
                carry=0;
            }
            if (curSum >= 10) {
                carry = curSum / 10;
                curSum = curSum % 10;
            }
            integers.push(curSum);
        }
        if(carry>0){
            integers.push(carry);
        }
        digits = new int[integers.size()];
        int i = 0;
        while (!integers.isEmpty()) {
            digits[i] = integers.pop();
            i++;
        }
        return digits;
    }
}
