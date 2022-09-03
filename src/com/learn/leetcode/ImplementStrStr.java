package com.learn.leetcode;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("aaaa", "bba"));
        System.out.println(strStr("aabaaabaaac","aabaaac"));
    }

    public static int strStr(String haystack, String needle) {

        int i = 0, j = 0;
        int output = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) {
                    output = i;
                }
                i++;
                j++;
                if (j == needle.length()) {
                    return output;
                }
            } else {
                if (j > 0) {
                    i = output;
                    output=0;
                }
                j = 0;
                i++;
            }
        }

        return j == needle.length() ? output : -1;
    }

}
