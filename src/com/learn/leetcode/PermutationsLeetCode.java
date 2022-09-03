package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationsLeetCode {
    public static void main(String[] args) {
    int[] nums={1,2,3};
    PermutationsLeetCode leetCode=new PermutationsLeetCode();
        System.out.println(leetCode.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        permute(nums, 0, nums.length - 1, output);
        return output;
    }

    private void permute(int[] str, int l, int r, List<List<Integer>> output) {
        if (l == r) {
            List<Integer> ar = new ArrayList<>();
            for (int i : str) {
                ar.add(i);
            }
            output.add(ar);
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i);
                permute(str, l + 1, r, output);
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
