package advance.java.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {12,7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int[] out = findTwoElement(arr, 14);
        if (Objects.nonNull(out)) {
            System.out.println(out[0] + " " + out[1]);
        }
    }

    static int[] findTwoElement(int arr[], int n) {
        int[] output = new int[2];
        if (arr.length < 2) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        int repeated = 0;

        for (int j : arr) {
            if (set.contains(j)) {
                repeated = j;
            } else {
                set.add(j);
            }
        }
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        output[0] = repeated;
        output[1] = missing;
        return output;
    }
}
