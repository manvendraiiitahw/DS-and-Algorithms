package advance.java.leetcode.subscription.neetcode.sliding.window;

public class PermutationInString {
    public static void main(String[] args) {
        PermutationInString permutationInString = new PermutationInString();
        System.out.println(permutationInString.checkInclusion("adc", "dcda"));
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 97]++;
        }
        int start = 0, cur = 0;
        while (cur < s2.length()) {
            if (cur - start == s1.length()) {
                return true;
            }
            if (count[s2.charAt(cur) - 97] > 0) {
                count[s2.charAt(cur) - 97]--;
                cur++;
            } else if (cur != start) {
                count[s2.charAt(start) - 97]++;
                start++;
            } else {
                cur++;
                start++;
            }
        }
        return cur - start == s1.length();
    }
}

