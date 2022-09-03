package com.learn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the secureChannel function below.
  static String secureChannel(int operation, String message, String key) {
    if (operation != 1 && operation != 2) {
      return "-1";
    }
    if (message==null || message.isEmpty()) {
      return "-1";
    }
    if (key==null || key.isEmpty()) {
      return "-1";
    }
    if(key.length()>message.length()){
      return "-1";
    }
    if (operation==1){
      StringBuffer res=new StringBuffer();
      int keylen=key.length();
      int i=0;
      int j=0;
      while(i<keylen && j<message.length()){
        int x=Character.getNumericValue(key.charAt(i)) ;
        for(int k=0;k<x;k++){
          res.append(message.charAt(j));
        }
        j++;
        i++;
      }
      while(j<message.length()){
        res.append(message.charAt(j));
        j++;
      }
      return res.toString();
    }else if(operation==2){
      StringBuffer res = new StringBuffer();
      int keylen = key.length();
      int i = 0;
      int j = 0;
      while (i < keylen && j < message.length()) {
        int x = Character.getNumericValue(key.charAt(i));
        res.append(message.charAt(j));
        for (int k = 0; k < x; k++) {
          j++;
        }
        i++;
      }
      while (j < message.length()) {
        res.append(message.charAt(j));
        j++;
      }
      return res.toString();
    }
    else{
      return "-1";
    }
  }

  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    int operation = Integer.parseInt(bufferedReader.readLine().trim());
//
//    String message = bufferedReader.readLine();
//
//    String key = bufferedReader.readLine();

    String msg1 = "Open";

    String key = "123";


    String res = secureChannel(1, msg1, key);
    System.out.println(res);
    res=secureChannel(2, res, "");
    System.out.println(res);

//    bufferedWriter.write(res);
//    bufferedWriter.newLine();

//    bufferedReader.close();
//    bufferedWriter.close();
  }
}