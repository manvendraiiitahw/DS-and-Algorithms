package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] str){
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        List<List<String>> lists=new ArrayList<>();
        for (int j=0;j< numRows;j++){
            List<String> strings=new ArrayList<>();
            lists.add(strings);
        }
        int i=0, curRow=0;
        boolean leftToRightInsertion=true;
        while (i< s.length()) {
            while (leftToRightInsertion && i< s.length()){
                if(curRow< numRows){
                    lists.get(curRow).add(String.valueOf(s.charAt(i)));
                    curRow++;
                    i++;
                }else {
                    leftToRightInsertion=false;
                    curRow=curRow-2;
                }
            }
            while (!leftToRightInsertion && i < s.length()){
                if(curRow>=0){
                    lists.get(curRow).add(String.valueOf(s.charAt(i)));
                    i++;
                    curRow--;
                }else {
                    leftToRightInsertion=true;
                    curRow=curRow+2;
                }
            }
        }
        StringBuilder stringBuilder=new StringBuilder("");
        for (List l: lists){
            for (Object st: l){
                stringBuilder.append(st);
            }
        }
        return stringBuilder.toString();
    }
}
