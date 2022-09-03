package com.learn.leetcode;

//https://leetcode.com/problems/divide-two-integers/
public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,1));
    }

    public static int divide(int dividend, int divisor) {
        boolean isNeg = dividend < 0 || divisor < 0;
        if(dividend < 0 && divisor < 0){
            isNeg=false;
        }
        if(dividend <= Integer.MIN_VALUE) {
            dividend = (int) (Math.pow(-2,31))+1;
        }
        if(dividend >= Integer.MAX_VALUE) {
            dividend = (int) (Math.pow(2,31)-1);
        }
        if(divisor <= Integer.MIN_VALUE) {
            divisor = (int) (Math.pow(-2,31));
        }
        if(divisor >= Integer.MAX_VALUE) {
            divisor = (int) (Math.pow(2,31)-1);
        }
        dividend=Math.abs(dividend);
        divisor = Math.abs(divisor);
        long count=0;
        while (dividend >= divisor) {
            count++;
            dividend = dividend - divisor;
        }
        return (int) (isNeg?-count:count);
    }
}
