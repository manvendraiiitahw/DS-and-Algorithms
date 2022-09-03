package com.learn.leetcode;

public class StringIntoInt {

    public static void main(String[] args) {
        System.out.println(myAtoi("3.2121"));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        long output = 0;
        boolean neg = false;
        for (char c : str.toCharArray()) {
            if (c == '-' || c == '+') neg = true;
            else {
                if (c == 32 || c==46) {
                    return generateValue(output, neg);
                } else if (c >= 48 && c < 58) {
                    if(neg){
                        output=-output;
                    }
                    if (
                            (output * 10 + Integer.parseInt(String.valueOf(c))) > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    if (output * 10 + Integer.parseInt(String.valueOf(c)) < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else {
                        if(neg){
                            output=-output;
                        }
                        output = output * 10 + Integer.parseInt(String.valueOf(c));
                    }
                } else {
                    return 0;
                }
            }
        }
        return generateValue(output, neg);
    }

    private static int generateValue(long output, boolean neg) {
        if (neg) {
            output = -(int) output;
            neg=false;
        }
        if (Integer.MIN_VALUE > output) {
            return Integer.MIN_VALUE;
        }
        if (Integer.MAX_VALUE < output) {
            return Integer.MAX_VALUE;
        } else {
            return (int) output;
        }
    }

}
