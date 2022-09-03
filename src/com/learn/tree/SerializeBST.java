package com.learn.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SerializeBST {

  public static void main(String[] args) {
    BSTree root = new BSTree(7);
    root.left = new BSTree(3);
    root.left.left = new BSTree(1);
    root.left.right = new BSTree(4);
    root.right = new BSTree(9);
    root.right.left = new BSTree(8);
    List<Integer> integers = new ArrayList<>();
    List<Integer> output = serialize(root, integers);
    assert output != null;
    for (Integer a : output) {
      System.out.println(a);
    }
  }

   static List<Integer> serialize(BSTree root, List<Integer> integers) {
    if (Objects.isNull(root)) {
      return null;
    } else {
      integers.add(root.data);
      serialize(root.left, integers);
      serialize(root.right, integers);
    }
    return integers;
  }
}
