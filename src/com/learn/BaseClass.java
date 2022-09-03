package com.learn;

public class BaseClass extends SuperClass {

  private void printB(){
    System.out.println("printB");
  }
  public static void main(String[] ars){

    SuperClass superClass=new BaseClass();
    ((BaseClass) superClass).printB();
  }

}
