package com.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman(1994));
    }

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (num >= 1000) {
            int d = num / 1000;
            stringBuilder.append("M".repeat(d));
            num = num % 1000;
        }
        if (num >= 900) {
            stringBuilder.append("CM");
            num = num % 900;
        }
        if (num >= 500) {
            stringBuilder.append("D");
            num = num % 500;
        }
        if (num >= 400) {
            stringBuilder.append("CM");
            num = num % 400;
        }
        if (num >= 100) {
            int d=num/100;
            stringBuilder.append("C".repeat(d));
            num = num % 100;
        }
        if (num >= 90) {
            stringBuilder.append("XC");
            num = num % 90;
        }
        if (num >= 50) {
            stringBuilder.append("L");
            num = num % 50;
        }
        if (num >= 40) {
            stringBuilder.append("XL");
            num = num % 40;
        }
        if (num >= 10) {
            int d = num / 10;
            stringBuilder.append("X".repeat(d));
            num = num % 10;
        }
        if (num == 9) {
            stringBuilder.append("IX");
            num = 0;
        }
        if (num >= 5) {
            stringBuilder.append("V");
            num = num % 5;
        }
        if (num == 4) {
            stringBuilder.append("IV");
            num = 0;
        }
        if (num >= 1) {
            stringBuilder.append("I".repeat(num));
        }

        return stringBuilder.toString();


    }
}
