package com.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args){
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        int output=0;
        Map<String, Integer> integerMap=initConst();
        for( int i=0;i<s.length();i++){
            int s1=integerMap.getOrDefault(String.valueOf(s.charAt(i)), -1);
            if(i+1 < s.length()){

                String concat = String.valueOf(s.charAt(i + 1));
                int s2 = integerMap.getOrDefault(concat, -1);
                if(s1 >= s2){
                    output=output+s1;
                }else{
                    output=output+s2-s1;
                    i++;
                }
            }else{
                output=output+s1;
            }
        }
        return output;
    }
    private static Map<String, Integer> initConst(){
        Map<String, Integer> constMap=new HashMap<>();
        constMap.put("I", 1);
        constMap.put("II", 2);
        constMap.put("III", 3);
        constMap.put("IV", 4);
        constMap.put("V", 5);
        constMap.put("VI", 6);
        constMap.put("VII", 7);
        constMap.put("VIII", 8);
        constMap.put("IX", 9);
        constMap.put("M",1000);
        constMap.put("MM", 2000);
        constMap.put("MMM", 3000);
        constMap.put("C",100);
        constMap.put("CC", 200);
        constMap.put("CCC", 300);
        constMap.put("CD",400);
        constMap.put("CM", 900);
        constMap.put("D", 500);
        constMap.put("DC", 600);
        constMap.put("DCC", 700);
        constMap.put("DCCC", 800);
        constMap.put("X", 10);
        constMap.put("XX", 20);
        constMap.put("XXX", 30);
        constMap.put("L", 50);
        constMap.put("XL", 40);
        constMap.put("LX", 60);
        constMap.put("LXX", 70);
        constMap.put("LXXX", 60);
        constMap.put("XC", 70);
        return constMap;
    }
}
