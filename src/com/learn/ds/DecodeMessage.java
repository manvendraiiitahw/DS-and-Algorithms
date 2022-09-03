package com.learn.ds;

import java.util.ArrayList;
import java.util.List;

public class DecodeMessage {
  public static void main(String[] args) {

    String a = "121";
    List<Integer> mem = new ArrayList<>(3);
    System.out.println(countWaysToDecodeMsg(a, a.length(), mem));


  }

  private static int countWaysToDecodeMsg(String str, int k, List<Integer> mem) {
    if (k == 0) return 1;
    if (str.charAt(str.length() - k) == '0') return 0;
    if (mem.size() == k) {
      return mem.get(k);
    }
    int result = countWaysToDecodeMsg(str, k - 1, mem);
    if (k >= 2 && (str.charAt(k - 2) == '1' || str.charAt(k - 2) == '2') && str.charAt(k - 1) < '7') {
      result += countWaysToDecodeMsg(str, k - 2, mem);
    }
    mem.add(result);
    return result;
  }
}
