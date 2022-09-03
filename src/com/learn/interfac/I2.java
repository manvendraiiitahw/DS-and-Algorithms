package com.learn.interfac;

public interface I2 {
  void add(int a);
  default void show(){
    System.out.println("Show I2");
  }
}
