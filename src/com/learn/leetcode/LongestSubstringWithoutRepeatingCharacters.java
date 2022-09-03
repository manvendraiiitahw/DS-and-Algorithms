package com.learn.leetcode;

import java.util.Objects;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    private static int lengthOfLongestSubstring(String s) {
        if (Objects.nonNull(s)) {
            if (s.length() == 0) {
                return 0;
            } else if (s.length() == 1) {
                return 1;
            } else {
                boolean[] count = new boolean[256];
                int i = 0, j = 1;
                int output = 1;
                count[s.charAt(0)] = true;
                while (i < s.length() && j < s.length()) {
                    while (count[s.charAt(j)]) {
                        int cOut = j - i;
                        if (output < cOut) {
                            output = cOut;
                        }
                        count[s.charAt(i)] = false;
                        i++;
                    }
                    count[s.charAt(j)] = true;
                    j++;
                }
                if (j - i > output) {
                    output = j - i;
                }
                return output;
            }
        }
        return 0;
    }
}
