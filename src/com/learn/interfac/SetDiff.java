package com.learn.interfac;

import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetDiff {
  public static void main(String[] args){
    int[] a1=new int[]{1,2,3,4,5,7};
    int[] a2=new int[]{1,2,4,6,7,8,9,12,14};
    Map<Integer,Integer> map=new HashMap<>();
    for(Integer i:a1){
      map.put(i,i);
    }
    for(Integer i: a2){
      if(map.containsKey(i)){
        map.remove(i);
      }else{
        map.put(i,i);
      }
    }
    for(Entry entry:map.entrySet()){
      System.out.print(entry.getValue()+" ");
    }

  }
}
