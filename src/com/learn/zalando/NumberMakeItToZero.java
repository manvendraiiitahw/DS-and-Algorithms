package com.learn.zalando;// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class NumberMakeItToZero {
    public int solution(String S) {
        // write your code in Java SE 8
        if(Objects.nonNull(S)){
            int decimalVal = NumberMakeItToZero.binaryToDecimal(S);
            return NumberMakeItToZero.countWays(decimalVal);
        }
        else {
            return 0;
        }
    }
    
    static int countWays(int n){ 
        if (n == 1){
            return 1;
        }
        else if (n % 2 == 0){
            return 1 + countWays(n / 2); 
        }
        else{
            return 1 + Math.min(countWays(n - 1), 
                                countWays(n + 1)); 
        }
    }
    
    static int binaryToDecimal(String n) 
    { 
        String num = n; 
        int decValue = 0; 
        int base = 1; 
        int len = num.length(); 
        for (int i = len - 1; i >= 0; i--) { 
            if (num.charAt(i) == '1') 
                decValue += base; 
            base = base * 2; 
        } 
        return decValue; 
    }
}
