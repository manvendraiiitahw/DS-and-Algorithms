package com.learn.leetcode;

public class ValidNumber {
    public static void main(String[] args) {
        ValidNumber validNumber = new ValidNumber();
        System.out.println(validNumber.isNumber(" 0.1 "));
    }

    public boolean isNumber(String s) {
        s = s.trim();
        if (s.contains("--") || s.contains("-+") || s.contains("+-") || s.contains("++")) {
            return false;
        }
        if (s.contains("e")) {
            String[] str = s.split("e");
            if (str[0].length() == 0 || str[1].length() == 0) {
                return false;
            }
            if (str[1].contains("--") || str[1].contains("-+") || str[1].contains("+-") || str[1].contains("++")) {
                return false;
            }
            if (str[1].contains(".")) {
                return false;
            }
            return !isStringOnlyAlphabet(str[0]) && !isStringOnlyAlphabet(str[1]);
        } else {
            for (int i = 0; i < s.length(); i++) {

                // If the current character is a digit
                if (isDigit(s.charAt(i))) {
                    int digit = s.charAt(i) - '0';
                }
            }
            isStringOnlyAlphabet(s);
            return false;
        }

    }

    public static boolean isStringOnlyAlphabet(String str) {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    static boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }
}
