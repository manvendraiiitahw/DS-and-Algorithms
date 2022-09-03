package coding.dcp.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given a dictionary of words and a pattern. Every character in the pattern is uniquely mapped to a character in the dictionary.
// Find all such words in the dictionary that match the given pattern.
//
//        Example 1:
//
//        Input:
//        N = 4
//        dict[] = {abb,abc,xyz,xyy}
//        pattern  = foo
//        Output: abb xyy
//        Explanation: xyy and abb have the same
//        character at index 1 and 2 like the
//        pattern.
public class MatchSpecificPattern {
    public static void main(String[] args) {
        ArrayList<String> output = new ArrayList<>();
        output.add("abb");
        output.add("abc");
        output.add("xyz");
        output.add("xyy");
        matchSpecificPattern(output, "foo");
    }

    static ArrayList<String> matchSpecificPattern(ArrayList<String> dict, String pattern) {
        ArrayList<String> output = new ArrayList<>();
        String p = encode(pattern);
        for (String s : dict) {
            String d = encode(s);
            if (p.length() == d.length()) {
                int i = 1;
                while (i < p.length() && p.charAt(i) == d.charAt(i)) {
                    i = i + 2;
                }
                if (i >= p.length()) {
                    output.add(s);
                }

            }
        }
        return output;
    }

    static String encode(String s) {
        StringBuilder encodedString = new StringBuilder("");
        encodedString.append(s.charAt(0));
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                encodedString.append(count);
                count = 1;
                encodedString.append(s.charAt(i + 1));
            }
        }
        encodedString.append(count);

        return encodedString.toString();
    }
}
