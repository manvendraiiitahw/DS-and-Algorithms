package com.learn.hashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LengthOfTheLongestSubstring {
    public static void main(String[] args) {
        LengthOfTheLongestSubstring length = new LengthOfTheLongestSubstring();
        System.out.println(length.longestUniqueSubStr("geeksforgeeks"));
    }

    int longestUniqueSubStr(String S) {
        if (S.length() == 0 || S.length() == 1) {
            return S.length();
        }
        int curMax = 0, max = 0;
        int i = 0, j = 0;
        Set<Character> set = new LinkedHashSet<>();
        while (i < S.length()) {
            if (set.contains(S.charAt(i))) {
                if (curMax > max) {
                    max = curMax;
                    while (j < i && S.charAt(j) != S.charAt(i) && !set.isEmpty()) {
                        set.remove(S.charAt(j));
                        j++;
                    }
                    set.add(S.charAt(i));
                    curMax = i - j;
                }
            } else {
                curMax++;
                set.add(S.charAt(i));
            }
            i++;
        }
        return Math.max(curMax, max);
    }
}
