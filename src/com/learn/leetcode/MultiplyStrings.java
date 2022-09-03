package com.learn.leetcode;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        MultiplyStrings strings = new MultiplyStrings();
        System.out.println(strings.multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] resultArr = new int[m + n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                int res = (num1.charAt(i) - '0') * (num2.charAt(j)- '0') + resultArr[i + j + 1];
                resultArr[i + j + 1] = res % 10;
                resultArr[i + j] += res / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k : resultArr){
            if (k != 0 || sb.length() != 0){
                sb.append(k);
            }
        }

        return sb.length() > 0 ? sb.toString() : "0";

    }
}
