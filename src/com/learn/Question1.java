package com.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String[] input=str.split(",");
        List<Integer> gDNum=new ArrayList<>();
        gDNum.add(9);
        gDNum.add(99);
        gDNum.add(999);
        gDNum.add(9999);
        gDNum.add(99999);
        gDNum.add(999999);
        gDNum.add(9999999);
        gDNum.add(99999999);
        gDNum.add(999999999);
        for (String st: input){
            int n=Integer.parseInt(st);
                int curNum = gDNum.get(n - 1);
                int rem=curNum%n;
                System.out.println(curNum-rem);
        }
    }
}
