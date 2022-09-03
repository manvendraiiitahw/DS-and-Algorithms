package com.learn.booking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test111111 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input= sc.next(); //List of employeeId in first party comma separated
    String[] emp1=input.split(",");
    String input1=sc.next();//List of employeeId in second party comma separated
    String[] emp2=input1.split(",");
    Map<String, Boolean> map=new HashMap<>();

    for(String st: emp1){
      map.put(st,true);
    }
    int output=0;
    for (String st: emp2){
      if(map.containsKey(st)){
        output++;
      }
    }
    System.out.println(output);
  }
}
