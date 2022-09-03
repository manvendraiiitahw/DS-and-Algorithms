package com.learn;

//import com.sun.tools.javac.util.Assert;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TestTreeMap {
  public static void main(String[] args){

    TreeMap<String, String> treeMap=new TreeMap<>(Comparator.reverseOrder());
    treeMap.put("1","11");
    treeMap.put("2","11");
    System.out.println(treeMap.keySet().toString());

    Map<String, String> mutableMap = new HashMap<>();
    mutableMap.put("USA", "North America");

    Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);
//    assertThrows(UnsupportedOperationException.class,
//        unmodifiableMap.put("Canada", "North America");
    mutableMap.remove("USA");
    System.out.println(unmodifiableMap.containsKey("USA"));

    mutableMap.put("Mexico", "North America");
    System.out.println(unmodifiableMap.containsKey("Mexico"));
    StringTokenizer tokenizer=new StringTokenizer("hackerearch hackathons", "h");

    while (tokenizer.hasMoreElements()){
      System.out.println(tokenizer.nextToken());
    }
  }
}
