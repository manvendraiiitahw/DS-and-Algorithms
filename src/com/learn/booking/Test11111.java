package com.learn.booking;

import java.util.Scanner;

public class Test11111 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input= sc.next();

    String[] str=input.split("-");
    String output="#";
    for(int i=0;i< str.length;i++){
      int val=Integer.valueOf(str[i]);
      if(val>255){
        System.out.println("NA");
        return;
      }
      String v = Integer.toHexString(val);
      if(v.length()==1){
        output=output+"0"+v;
      }else{
        output=output+v;
      }
    }
    System.out.println(output);

  }
}
