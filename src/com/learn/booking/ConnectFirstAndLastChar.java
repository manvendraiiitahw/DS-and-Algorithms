package com.learn.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectFirstAndLastChar {
  public static void main(String[] args) {
    String start = "";
    String[] input = new String[]{"Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban"};
    Map<String, String> hashMap = new HashMap();
    for (String str : input) {
      hashMap.put((str.substring(str.length() - 1, str.length())).toUpperCase(), str);
    }
    for (String str : input) {
      if (!hashMap.containsKey(str.substring(0, 1))) {
        start = str;
        break;
      }
    }

    hashMap = new HashMap<>();
    for (String str : input) {
      if (!str.equals(start))
        hashMap.put((str.substring(0, 1)).toUpperCase(), str);
    }

    List<String> output=new ArrayList<>();
    output.add(start);

    while (!hashMap.isEmpty()) {
      String s = hashMap.get(start.substring(start.length() - 1, start.length()).toUpperCase());
      output.add(s);
      hashMap.remove(start.substring(start.length() - 1, start.length()).toUpperCase());
      start = s;
    }
System.out.println(output);

  }
}
