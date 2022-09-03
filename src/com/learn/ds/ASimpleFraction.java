package com.learn.ds;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class ASimpleFraction {
    public static void main(String[] args) {

        List<Integer> arara=new ArrayList<>();


        int a = 5, b = 2, cnt=1;
        List<Character> output = new ArrayList<>();
        while (true) {
            if (a < b) {
                a = a * 10;
                if(!output.contains('.')) {
                    output.add('.');
                }
            }
            int c = a / b;
            a=a%b;
            if(c>10) {
                String s = String.valueOf(c);
                int i = 0;
                while (i < s.length()) {
                    output.add(s.charAt(i));
                    i++;
                }
            }else {
                Character c1= (char) c;
                if(output.size() >0 && output.get(output.size()-1).equals(c1)){
                    cnt++;
                    output.add((char) c);
                }else{
                    cnt=1;
                    output.add((char) c);
                }

            }
            if(a==0){
                System.out.println(output);
            }
            if(cnt>2){
                for(int i=0;i<output.size();i++){

                }
                break;
            }
        }

    }
}
