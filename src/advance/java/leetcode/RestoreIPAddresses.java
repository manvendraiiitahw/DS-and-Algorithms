package advance.java.leetcode;
//A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
//
//        For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
//        Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public static void main(String[] args) {
        List<String> out = restoreIpAddresses("101023");
        assert out != null;
        for (String s : out) {
            System.out.println(s);
        }
    }

    private static boolean validIpAddress(String str) {
        if (str.length() > 3) {
            return false;
        }

        if (str.charAt(0) == '0' && str.length() > 1) {
            return false;
        }
        int val = Integer.parseInt(str);
        return val >= 0 && val <= 255;
    }


    public static List<String> restoreIpAddresses(String s) {
        if (s.length() < 4) {
            return null;
        }
        List<String> res = new ArrayList<>();
        String first = "", second = "", third = "", fouth = "";
        for (int i = 1; i < 4 && i < s.length(); i++) {
            first = s.substring(0, i);
            if (validIpAddress(first)) {
                for (int j = 1; j <= 4 && i + j < s.length(); j++) {
                    second = s.substring(i, i+j);
                    if (validIpAddress(second)) {
                        for (int k = 1; k < 4 && i + j + k < s.length(); k++) {
                            third = s.substring(i + j, i+j+k);
                            if (validIpAddress(third)) {
                                fouth = s.substring(i + j + k);
                                if (validIpAddress(fouth)) {
                                    res.add(first + "." + second + "." + third + "." + fouth);
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
