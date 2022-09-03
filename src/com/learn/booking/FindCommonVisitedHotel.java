package com.learn.booking;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindCommonVisitedHotel {
  public static void main(String[] args) {

    int[] A = new int[]{2, 3, 1, 1};
    int[] B = new int[]{2, 3, 3};
    int[] C = new int[]{7, 3, 1};
    Map<Integer, Integer> hashMap = new HashMap<>();
    for (int a : A) {
      if (!hashMap.containsKey(a)) {
        hashMap.put(a, 1);
      }
    }
    for (int a : B) {
      if (hashMap.containsKey(a) && hashMap.get(a) == 1) {
        hashMap.put(a, hashMap.get(a) + 1);
      } else if (!hashMap.containsKey(a)) {
        hashMap.put(a, 1);
      }
    }
    for (int a : C) {
      if (hashMap.containsKey(a) && hashMap.get(a) == 2) {
        hashMap.put(a, hashMap.get(a) + 1);
      } else if (!hashMap.containsKey(a)) {
        hashMap.put(a, 1);
      }
    }

    for (Entry entry : hashMap.entrySet()) {
      if (3 == (Integer) (entry.getValue())) {
        System.out.println("Common hotelID::" + entry.getKey());
      }
    }

  }
}
