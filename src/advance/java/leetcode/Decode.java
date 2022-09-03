package advance.java.leetcode;

import java.util.List;
import java.util.Scanner;

//A message containing letters from A-Z can be encoded into numbers using the following mapping:
//
//        'A' -> "1"
//        'B' -> "2"
//        ...
//        'Z' -> "26"
//        To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
//
//        "AAJF" with the grouping (1 1 10 6)
//        "KJF" with the grouping (11 10 6)
//        Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
//
//        Given a string s containing only digits, return the number of ways to decode it.
//
//        The test cases are generated so that the answer fits in a 32-bit integer.
public class Decode {

    // recuring function to find
    // ways in how many ways a
    // string can be decoded of length
    // greater than 0 and starting with
    // digit 1 and greater.
    static int countDecoding(char[] digits, int n)
    {
        // base cases
        if (n == 0 || n == 1)
            return 1;

        // for base condition "01123" should return 0
        if (digits[0] == '0')
            return 0;

        // Initialize count
        int count = 0;

        // If the last digit is not 0, then
        // last digit must add to
        // the number of words
        if (digits[n - 1] > '0')
            count = countDecoding(digits, n - 1);

        // If the last two digits form a number
        // smaller than or equal to 26,
        // then consider last two digits and recur
        if (digits[n - 2] == '1'
                || (digits[n - 2] == '2'
                && digits[n - 1] < '7'))
            count += countDecoding(digits, n - 2);

        return count;
    }

    // Given a digit sequence of length n,
    // returns count of possible decodings by
    // replacing 1 with A, 2 with B, ... 26 with Z
    static int countWays(char[] digits, int n)
    {
        if (n == 0 || (n == 1 && digits[0] == '0'))
            return 0;
        return countDecoding(digits, n);
    }

    static int countDecodingDP(char digits[],
                               int n)
    {
        // A table to store results of subproblems
        int count[] = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        if(digits[0]=='0')   //for base condition "01123" should return 0
            return 0;
        for (int i = 2; i <= n; i++)
        {
            count[i] = 0;

            // If the last digit is not 0,
            // then last digit must add to
            // the number of words
            if (digits[i - 1] > '0')
                count[i] = count[i - 1];

            // If second last digit is smaller
            // than 2 and last digit is smaller
            // than 7, then last two digits
            // form a valid character
            if (digits[i - 2] == '1' ||
                    (digits[i - 2] == '2' &&
                            digits[i - 1] < '7'))
                count[i] += count[i - 2];
        }
        return count[n];
    }


    // Driver code
    public static void main(String[] args)
    {
        char digits[] = { '1', '2', '3', '4' };
        int n = digits.length;
        System.out.printf("Count is %d",
                countWays(digits, n));

        System.out.println("Count is "+
                countDecodingDP(digits, n));
    }
}
