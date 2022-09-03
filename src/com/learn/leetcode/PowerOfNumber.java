package com.learn.leetcode;

public class PowerOfNumber {
    public static void main(String[] args) {
        double a = 2.10;
        int b = 3;
        if (b < 0) {
            double mul=multiply(a, Math.abs(2));
            System.out.println(1/mul);
        }
        else {
            double v=Double.valueOf(String.format( "%.5f", multiply(a,b)));
            System.out.println(v);
        }
    }

    static double multiply(double a, int b) {
        double val = 1;
        for (int i = 1; i <= b; i++) {
            val = val * a;
        }
        return val;
    }
}
