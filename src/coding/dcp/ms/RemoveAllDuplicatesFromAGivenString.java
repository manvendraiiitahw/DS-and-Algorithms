package coding.dcp.ms;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveAllDuplicatesFromAGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            removeDuplicates(s);

        }
    }

    static void removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                System.out.print(s.charAt(i));
                set.add(s.charAt(i));
            }
            i++;
        }
        System.out.println();

    }
}
