package coding.dcp.ms;

import java.util.HashSet;

public class MinDeletionstoMakeFrequencyofEachLetterUnique {
    public static void main(String[] args) {
        System.out.println(minDeletion("abbbcccdddddeeeeee"));
    }

    static int minDeletion(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        int output = 0;
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (integers.contains(count[i])) {
                    int v = count[i] - 1;
                    output++;
                    while (v > 0 && integers.contains(v)) {
                        output++;
                        v--;
                    }
                    integers.add(v);
                } else {
                    integers.add(count[i]);
                }
            }
        }
        return output;
    }
}
