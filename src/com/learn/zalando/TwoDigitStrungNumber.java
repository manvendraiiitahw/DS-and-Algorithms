package com.learn.zalando;


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class TwoDigitStrungNumber {
    public static void main(String[] args) {
        String s="88";
        TwoDigitStrungNumber twoDigitStrungNumber=new TwoDigitStrungNumber();
        System.out.println(twoDigitStrungNumber.solution(s));
    }
    public int solution(String S) {
        // write your code in Java SE 8
        int j=0;
        int curMax=Integer.MIN_VALUE;
        for(int i=2;i<=S.length();i++){
            int val=Integer.parseInt(S.substring(j,i));
            if(curMax<val){
                curMax=val;
            }
            j++;
        }
        return curMax;
    }
}