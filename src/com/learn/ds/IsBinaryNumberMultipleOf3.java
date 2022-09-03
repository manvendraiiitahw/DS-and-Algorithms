package com.learn.ds;

import java.math.BigInteger;
import java.util.Stack;

public class IsBinaryNumberMultipleOf3 {
    public static void main(String[] args) {
        IsBinaryNumberMultipleOf3 multiple = new IsBinaryNumberMultipleOf3();
        System.out.println(multiple.isDivisible("100100000111111101010010010011010101110110"));
    }

    int isDivisible(String s) {
        if (s.length() < 2) {
            return 0;
        }
//        BigInteger num = new BigInteger(String.valueOf(0));
//        int i = 0;
//        int j = s.length() - 1;
//        while (j >= 0) {
//            int c = Integer.parseInt(String.valueOf(s.charAt(j)));
//            num = num.multiply(new BigInteger(String.valueOf(10)));
//            int currNum = c * (int) Math.pow(2, i);
//            num = num.add(new BigInteger(String.valueOf(currNum)));
//            i++;
//            j--;
//        }
//        num = num.mod(new BigInteger(String.valueOf(3)));
//        if (num.equals(new BigInteger(String.valueOf(0)))) {
//            return 1;
//        }
//        return 0;
        int countOddNonZeroBitPosition = 0;
        int countEvenNonZeroBitPosition = 0;
        int j = s.length() - 1;
        while (j >= 0) {
            if (Integer.parseInt(String.valueOf(s.charAt(j))) > 0) {
                countOddNonZeroBitPosition++;
            }
            j = j - 2;
        }
        j = s.length() - 2;
        while (j >= 0) {
            if (Integer.parseInt(String.valueOf(s.charAt(j))) > 0) {
                countEvenNonZeroBitPosition++;
            }
            j = j - 2;
        }
        int diff = Math.abs(countEvenNonZeroBitPosition - countOddNonZeroBitPosition);
        return diff % 3 == 0 ? 1 : 0;
    }
}
