package advance.java.leetcode.subscription.neetcode;

import java.util.*;

public class FIndDuplicates {
    public static void main(String[] args) {
        FIndDuplicates fIndDuplicates = new FIndDuplicates();
        int n = 6;
        int[] arr = {4, 4, 7, 8, 8, 9};
        arr = fIndDuplicates.duplicates(n, arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[] duplicates(int n, int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (integerSet.contains(a)) {
                integerSet.add(a);
                list.add(a);
            } else {
                integerSet.add(a);
            }
        }
        if (list.size() < 1) {
            int[] output = new int[1];
            output[0] = -1;
            return output;
        }
        Collections.sort(list);
        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;

    }
}
