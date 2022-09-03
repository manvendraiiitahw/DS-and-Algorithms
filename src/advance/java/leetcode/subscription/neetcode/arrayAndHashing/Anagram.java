package advance.java.leetcode.subscription.neetcode.arrayAndHashing;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat", t = "cat";
        Anagram anagram=new Anagram();
        System.out.println(anagram.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
