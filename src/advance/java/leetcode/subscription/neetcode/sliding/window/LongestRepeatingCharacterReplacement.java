package advance.java.leetcode.subscription.neetcode.sliding.window;


public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement characterReplacement = new LongestRepeatingCharacterReplacement();
        System.out.println(characterReplacement.characterReplacement("ABABBAB", 1));
    }

    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0, r = 0;
        int max = Integer.MIN_VALUE;
        while (r < s.length()) {
            count[s.charAt(r) - 65]++;
            while (r - l + 1 - getMax(count) > k) {
                count[s.charAt(l) - 65]--;
                l++;
            }
            if (max < r - l + 1) {
                max = r - l + 1;
            }
            r++;
        }
        return max;
    }

    int getMax(int[] count) {
        int curMax = count[0];
        for (int i = 1; i < 26; i++) {
            if (curMax < count[i]) {
                curMax = count[i];
            }
        }
        return curMax;
    }
}
