package com.learn.array;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/27/19
 */

import com.learn.tree.BinaryTree;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDeclaration {
  static class TimeAD{
    char a;
    Integer t;
  }
  public static void main(String[] args) {// void main
    Scanner scanner = new Scanner(System.in);//no need in case of C programming
    int avg, sum = 0, m;
    int i = 0;
    int[] marks = new int[10];//int marks[10];
    for (i = 0; i < 5; i++) {
      marks[i] = scanner.nextInt();//same as scanf("%d",&m);
    }
    for (i = 0; i < 10; i++)
      sum = sum + marks[i];

    avg = sum / 10;
    System.out.println("average =" + avg);// printf("Avg=%d",avg);
    List<TimeAD> binaryTrees=new ArrayList<>();
    Collections.sort(binaryTrees, (Comparator<TimeAD>) (o1, o2) -> o1.t.compareTo(o2.t));

  }
}
