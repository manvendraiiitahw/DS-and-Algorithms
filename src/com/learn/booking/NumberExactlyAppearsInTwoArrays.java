package com.learn.booking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberExactlyAppearsInTwoArrays {

  public static void main(String[] args) {

    int[][] inp = new int[][]{
        {6, 2, 2, 0, 4},
        {5, 0, 2, 6, 7, 1},
        {6, 7, 9, 9}
    };

    Map<Integer, Integer> map = new HashMap<>();
    for (int[] anInp : inp) {
      Set<Integer> set = new HashSet<>();
      for (int anAnInp : anInp) {
        set.add(anAnInp);
      }
      for (Integer integer : set) {
        if (map.containsKey(integer)) {
          int currentValueCount = map.get(integer);
          map.put(integer, currentValueCount + 1);
        } else {
          map.put(integer, 1);
        }
      }
    }

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 2) {
        System.out.println(entry.getKey());
      }
    }


  }


}
