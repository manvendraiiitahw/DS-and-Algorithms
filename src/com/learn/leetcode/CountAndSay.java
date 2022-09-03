package com.learn.leetcode;

public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay say = new CountAndSay();
        System.out.println(say.countAndSay(6));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String res = "11";
        int i = 2;
        while (i <= n) {
            int j = 0;
            int count = 0;
            while (j < res.length() - 1 && res.charAt(j) == res.charAt(i + 1)) {
                count = count + 2;
            }


        }
        return "";
    }
}
