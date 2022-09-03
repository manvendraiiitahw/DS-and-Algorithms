package com.learn.interfac;

public interface I1 {
  void add(int a);
  default void show(){
    System.out.println("Show I1");
  }
  default boolean testabc(){
    return true;
  }
}
