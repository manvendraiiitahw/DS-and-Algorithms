package com.learn.leetcode;

public class RegularExpressionMatchingDP {
    public static void main(String[] args) {
        System.out.println(RegularExpressionMatchingDP.isMatch("xaabyc", "xa*b.c"));
    }

    static boolean isMatch(String text, String pat) {
        boolean[][] T = new boolean[text.length() + 1][pat.length() + 1];
        T[0][0] = true;
        //This is to fill first row for pattern like a* or a*b*c*
        for (int i = 1; i < T[0].length; i++) {
            if (pat.charAt(i - 1) == '*') {
                T[0][i] = T[0][i - 2];
            }
        }
        for (int i = 1; i <= text.length(); i++) {
            for (int j = 1; j <= pat.length(); j++) {
                if (text.charAt(i - 1) == pat.charAt(j - 1) || pat.charAt(j - 1) == '.') {
                    T[i][j] = T[i - 1][j - 1];
                } else if (pat.charAt(j - 1) == '*') {
                    if (T[i][j - 2]) {
                        T[i][j] = T[i][j - 2];
                    }
                    if (text.charAt(i - 1) == pat.charAt(j - 2) || pat.charAt(j - 1) == '.') {
                        T[i][j] = T[i - 1][j];
                    }
                } else {
                    T[i][j] = false;
                }
            }
        }


        return T[text.length()][pat.length()];
    }
}
