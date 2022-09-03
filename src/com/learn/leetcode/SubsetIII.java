package com.learn.leetcode;

import java.util.*;

//Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
public class SubsetIII {
    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4};
        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            List<Integer> subRes = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                /// Check if jth bit in the i is set. If the bit
                // is set, we consider jth element from set 
                if ((i & (1 << j)) != 0) {
                    subRes.add(nums[j]);
                }
            }
            Collections.sort(subRes);
            if (!res.contains(subRes)) {
                res.add(subRes);
            }
        }
        return res;
    }

}
