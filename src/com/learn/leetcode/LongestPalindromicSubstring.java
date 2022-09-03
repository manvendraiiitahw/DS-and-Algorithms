package com.learn.leetcode;

import java.util.Objects;
import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(LongestPalindromicSubstring.longestPalindrome(input));
    }

    private static String longestPalindrome(String s) {
        if (Objects.nonNull(s)) {
            if (s.length() == 0) {
                return "";
            }
            if (s.length() == 1) {
                return s;
            } else {
                int palindromicBegin = 0;
                int maxlen = 0;
                boolean[][] dp = new boolean[s.length()][s.length()];
                for (int i = 0; i < s.length(); i++) {
                    dp[i][i] = true;
                }
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        dp[i][i + 1] = true;
                        palindromicBegin = i;
                        maxlen = i+1;
                    }
                }
                for (int curLen = 3; curLen <= s.length(); curLen++) {
                    for (int i = 0; i < (s.length() - curLen+1); i++) {
                        int j = i + curLen - 1;
                        if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                            dp[i][j] = true;
                            if(i==0) {
                                palindromicBegin = i;
                                maxlen = curLen-1;
                            }else{
                                palindromicBegin = i;
                                maxlen = j;
                            }
                        }
                    }
                }


                return s.substring(palindromicBegin, maxlen+1);
            }
        }
        return null;
    }
}
