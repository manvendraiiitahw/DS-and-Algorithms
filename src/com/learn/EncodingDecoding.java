package com.learn;//package com.learn;

import java.io.IOException;

public class EncodingDecoding {


  // Complete the secureChannel function below.

  public static String secureChannel(int operation, String message, String key) {
    if (operation != 1 && operation != 2) {
      return "-1";
    }
    if (message == null || message.isEmpty()) {
      return "-1";
    }
    if (key == null || key.isEmpty()) {
      return "-1";
    }
    if (operation == 2) {
      {

        StringBuffer res = new StringBuffer();

        int keylen = key.length();

        int i = 0;

        int j = 0;

        while (i < keylen && j < message.length()) {
          int x = Character.getNumericValue(key.charAt(i));
          res.append(message.charAt(j));
          i++;
          j = j + x;
        }

        while (j < message.length()) {
          res.append(message.charAt(j));
          j++;

        }

        return res.toString();
      }
    } else if (operation == 1) {

      StringBuffer res = new StringBuffer();

      int keylen = key.length();

      int i = 0;

      int j = 0;

      while (i < keylen && j < message.length()) {

        int x = Character.getNumericValue(key.charAt(i));

        for (int k = 0; k < x; k++) {

          res.append(message.charAt(j));

        }

        j++;

        i++;

      }

      while (j < message.length()) {
        res.append(message.charAt(j));
        j++;

      }

      return res.toString();
    }else{
      return "-1";
    }
  }

  public static String decoding(int operation, String message, String key) {

    StringBuffer res = new StringBuffer();

    int keylen = key.length();

    int i = 0;

    int j = 0;

    while (i < keylen && j < message.length()) {
      int x = Character.getNumericValue(key.charAt(i));
      res.append(message.charAt(j));
      i++;
      j = j + x;
    }

    while (j < message.length()) {
      res.append(message.charAt(j));
      j++;

    }

    return res.toString();
  }

  public static void main(String[] args) throws IOException {

    int op1 = 1;

    String msg1 = "Open";

    String key = "123";

    String res = secureChannel(op1, msg1, key);

    System.out.println(res);
    System.out.println(secureChannel(2, res, ""));

  }

}
//import java.io.IOException;
//import java.util.Objects;
//
//
//public class EncodingDecoding {
//
//
//  // Complete the secureChannel function below.
//
//  public static String secureChannel(int operation, String message, String key) {
//
//    if(operation!=1 && operation!=2){
//      return "-1";
//    }
//    if(Objects.isNull(message))
//    {
//      return "-1";
//    }
//    if(Objects.isNull(key)){
//      return "-1";
//    }
//
//    if (operation == 1) {
//
//      StringBuffer res = new StringBuffer();
//
//      int keylen = key.length();
//
//      int i = 0;
//
//      int j = 0;
//
//      while (i < keylen && j < message.length()) {
//
//        int x = Character.getNumericValue(key.charAt(i));
//
//        for (int k = 0; k < x; k++) {
//
//          res.append(message.charAt(j));
//
//        }
//
//        j++;
//
//        i++;
//
//      }
//
//      while (j < message.length()) {
//
//        res.append(message.charAt(j));
//
//        j++;
//
//      }
//
//      return res.toString();
//
//    }
//
//    else {
//
//      StringBuffer res = new StringBuffer();
//
//      int keylen = key.length();
//
//      int i = 0;
//
//      int j = 0;
//
//      while (i < keylen && j < message.length()) {
//
//        int x = Character.getNumericValue(key.charAt(i));
//
//        res.append(message.charAt(j));
//
//        for (int k = 0; k < x; k++) {
//
//          j++;
//
//        }
//
//        i++;
//
//      }
//
//      while (j < message.length()) {
//
//        res.append(message.charAt(j));
//
//        j++;
//
//      }
//
//      return res.toString();
//
//
//    }
//
//
//  }
//
//
//  public static void main(String[] args) throws IOException {
//
//    int op1=1;
//
//    String msg1="Open";
//
//    String key="123";
//
//    String res=secureChannel(op1,msg1,key);
//
//    System.out.println(res);
//
//
//
//    int op2=2;
//
//    String msg2="Oppeeen";
//
//    String key2="123";
//
//    String res1=secureChannel(op2,msg2,key2);
//
//    System.out.println(res1);
//
//  }
//
//
//
//}