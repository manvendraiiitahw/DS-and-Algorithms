package com.learn.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PermutationsWithoutDuplicateLeetCode {
    public static void main(String[] args) {
        int[] nums = {1, 1,2};
        PermutationsWithoutDuplicateLeetCode leetCode = new PermutationsWithoutDuplicateLeetCode();
        System.out.println(leetCode.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        permute(nums, 0, nums.length - 1, output, new LinkedHashSet<>());
        return output;
    }

    private void permute(int[] str, int l, int r, List<List<Integer>> output, LinkedHashSet<List<Integer>> listLinkedHashSet) {
        if (l == r) {
            List<Integer> ar = new ArrayList<>();
            for (int i : str) {
                ar.add(i);
            }
            if (!listLinkedHashSet.contains(ar)) {
                output.add(ar);
                listLinkedHashSet.add(ar);
            }
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i);
                permute(str, l + 1, r, output, listLinkedHashSet);
                swap(str, l, i);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
