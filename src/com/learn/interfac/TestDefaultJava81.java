package com.learn.interfac;

public class TestDefaultJava81 implements I1 {
  public static void main(String[] args) {
    TestDefaultJava81 testDefaultInJava81 = new TestDefaultJava81();
    testDefaultInJava81.show();
    testDefaultInJava81.add(1);
    System.out.println(testDefaultInJava81.testabc());
  }

  @Override
  public void add(int a) {
    System.out.println("aaa"+a);
  }

}
