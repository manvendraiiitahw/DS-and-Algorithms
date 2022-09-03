package com.learn.interfac;

public class TestDefaultInJava8 implements I1,I2 {
  @Override
  public void add(int a) {
    System.out.println("value a");
  }

  @Override
  public void show() {
    System.out.println("From class");
  }

}
