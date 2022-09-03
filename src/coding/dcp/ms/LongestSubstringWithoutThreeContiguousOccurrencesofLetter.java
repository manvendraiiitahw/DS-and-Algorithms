package coding.dcp.ms;

public class LongestSubstringWithoutThreeContiguousOccurrencesofLetter {
    public static void main(String[] args) {
        System.out.println(longestSubstring(""));
    }

    static int longestSubstring(String s) {
        if (s.length() <= 2) {
            return s.length();
        } else {
            int start = 0;
            int i = 0, curMax = 0, max = -1, count = 1;
            while (i < s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1) && count < 3) {
                    count++;
                } else if (s.charAt(i) != s.charAt(i + 1)) {
                    count = 1;
                }
                if (count == 3) {
                    max = Math.max((i - start) + 1, max);
                    start = i + 1;
                    count = 1;
                }
                i++;
            }
            return Math.max(max, i - start + 1);
        }
    }
}
