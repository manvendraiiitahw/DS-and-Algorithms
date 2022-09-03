package advance.java.leetcode.subscription.neetcode.sliding.window;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//leetcode:76
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        MinimumWindowSubstring windowSubstring = new MinimumWindowSubstring();
        System.out.println(windowSubstring.minWindow("cabwefgewcwaefgcf","cae"));
    }

    public String minWindow(String s, String t) {
        if (Objects.equals(s, "")) {
            return "";
        }
        Map<Character, Integer> tFreq = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (tFreq.containsKey(t.charAt(i))) {
                tFreq.put(t.charAt(i), tFreq.get(t.charAt(i)) + 1);
            } else {
                tFreq.put(t.charAt(i), 1);
            }
        }
        Map<Character, Integer> haveFreq = new HashMap<>();
        int start = 0, val = 0;
        int output = Integer.MAX_VALUE;
        String out = "";
        for (int cur = 0; cur < s.length(); cur++) {

            if (haveFreq.containsKey(s.charAt(cur))) {
                haveFreq.put(s.charAt(cur), haveFreq.get(s.charAt(cur)) + 1);
            } else {
                haveFreq.put(s.charAt(cur), 1);
            }
            if (tFreq.containsKey(s.charAt(cur)) && Objects.equals(tFreq.get(s.charAt(cur)), haveFreq.get(s.charAt(cur)))) {
                val++;
            }

            while (val == tFreq.size()) {
                if(output > (cur-start+1)) {
                    output = cur - start + 1;
                    out = s.substring(start, cur + 1);
                }
                haveFreq.put(s.charAt(start), haveFreq.get(s.charAt(start)) - 1);
                if (tFreq.containsKey(s.charAt(start)) && haveFreq.get(s.charAt(start)) < tFreq.get(s.charAt(start))) {
                    val--;
                }
                start++;
            }
        }
        return out;
    }
}
