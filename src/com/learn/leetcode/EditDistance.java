package com.learn.leetcode;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "ate";
        EditDistance distance = new EditDistance();
        System.out.println(distance.minDistance(s1, s2));
    }

    public int minDistance(String word1, String word2) {
        int[][] T = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < T[0].length; i++) {
            T[0][i] = i;
        }
        for (int i = 0; i < T.length; i++) {
            T[i][0] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    T[i][j] = T[i - 1][j - 1];
                } else {
                    T[i][j] = minimumVal(T[i - 1][j - 1], T[i - 1][j], T[i][j - 1]) + 1;
                }
            }
        }
        return T[word1.length()][word2.length()];
    }

    private static int minimumVal(int a, int b, int c) {
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
}
