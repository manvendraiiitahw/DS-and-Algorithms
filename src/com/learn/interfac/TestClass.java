package com.learn.interfac;

public class TestClass implements TestB, TestC {
  @Override
  public void print() {
    System.out.println("testing");
  }

  public static void main(String[] args) {
    TestClass testClass = new TestClass();
    testClass.print();
  }
}
