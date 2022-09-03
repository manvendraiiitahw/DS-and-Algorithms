package com.learn.leetcode;

public class ReverseInteger {
    public static void main(String[] str){
        System.out.println(reverse(1056389759));
    }
    static int reverse(int x) {
        int output=0;
        while(x != 0){
            output=output*10 + (x%10);
            x=x/10;
        }
        if (output < Integer.MIN_VALUE || output > Integer.MAX_VALUE) {
            return 0;
        }
        return output;
    }
}
