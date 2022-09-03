package com.learn;

import java.util.ArrayList;
import java.util.List;

public class TestListt {
  public static void main(String[] args){
    List<Object> objectList=new ArrayList<>();
    objectList.add(1);
    objectList.add("asd");
    System.out.println(objectList);
    List a=new ArrayList();
    a.add(1);
    a.add("abs");
    System.out.println(a);

    List<Integer> s=new ArrayList<>();
    s.add(5537);
    s.add(5538);

    String str=s.toString();
    str=str.replace("[", "(");
    str=str.replace("]", ")");
    System.out.println(str);
  }
}
