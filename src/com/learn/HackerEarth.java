package com.learn;

import java.util.TreeSet;

interface int1{
  int i=0;
}

interface int2{
  int i=0;
}

public class HackerEarth implements int1,int2 {
  public static void main(String[] args){
    TreeSet<StringBuffer> stringBuffers=new TreeSet<>();
    stringBuffers.add(new StringBuffer("h"));
    stringBuffers.add(new StringBuffer("a"));
    stringBuffers.add(new StringBuffer("c"));
    stringBuffers.add(new StringBuffer("k"));
    System.out.println(stringBuffers);
  }
}
