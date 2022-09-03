package com.learn.booking;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    String s = "aabcc";
    char[] inp = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    int currentLength = 0;
    int maxLength = 0;
    int start = 0;
    int end = 0;

    for (int i = 0; i < inp.length; i++) {
      if (map.containsKey(inp[i])) {
        if (currentLength > maxLength) {
          maxLength = currentLength;
          if (currentLength > 1)
            currentLength--;
        }
        end = i;
      } else {
        currentLength++;
        map.put(inp[i], 1);
      }
    }
    if (currentLength > maxLength) {
      maxLength = currentLength;
    }
    System.out.println(maxLength);
  }
}
