package geeksforgeeks.mustdo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestKUniqueCharactersSubstring {
    public static void main(String[] args) {
        System.out.println(LongestKUniqueCharactersSubstring.longestkSubstr("aaaaa", 2));
    }

    public static int longestkSubstr(String s, int k) {
        if (s.length() < k) {
            return -1;
        }
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
            }
        }
        Set<Character> set = new HashSet<>();
        int len = 0, output=-1;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (len < k || set.contains(s.charAt(i))) {
                if (!set.contains(s.charAt(i))) {
                    len++;
                    set.add(s.charAt(i));
                }
            } else {
                if ((i - start) > output) {
                    output = i - start;
                }
                int charIndex=map.get(s.charAt(start));
                while (start <= charIndex) {
                    if (set.contains(s.charAt(start))) {
                        set.remove(s.charAt(start));
                        len--;
                    }
                    start++;
                }
                set.add(s.charAt(i));
                len++;
            }
        }
        if ((i - start) > output && len==k) {
            output = i - start;
        }

        return output;
    }
}
