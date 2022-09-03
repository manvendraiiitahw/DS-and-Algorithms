package coding.dcp.ms;

public class BinaryReprOfANumberIsPalindromeOrNot {

// Java Program to Check if binary representation
// of a number is palindrome

    // This function returns true if k'th bit in x
    // is set (or 1). For example if x (0010) is 2
    // and k is 2, then it returns true
    static int isKthBitSet(long x, long k) {
        return ((x & (1 << (k - 1))) != 0) ? 1 : 0;
    }

    // This function returns true if binary
    // representation of x is palindrome.
    // For example (1000...001) is paldindrome
    static Boolean isPalindrome(long x) {
        long l = 1; // Initialize left position
        long r = (Integer.SIZE / 8); // initialize right position

        // One by one compare bits
        while (l < r) {
            if (isKthBitSet(x, l) != isKthBitSet(x, r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        long x = 15;
        System.out.println(isPalindrome(x));

        x = (1 << 31) + 1;
        System.out.println(isPalindrome(x));
    }
}

// This code is contributed by AnkitRai01


