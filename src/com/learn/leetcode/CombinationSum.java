package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,7,6,3,5,1};
        int sum = 9;

        CombinationSum sum1 = new CombinationSum();
        System.out.println(sum1.combinationSum(arr, sum));

    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new Stack<>();
        process(candidates, res, cur, 0, target);
        return res;
    }

    static void process(int[] arr, List<List<Integer>> res, List<Integer> cur, int i, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList(cur));
        }
        while (i < arr.length) {
            cur.add(arr[i]);
            process(arr, res, cur, i, target - arr[i]);
            i++;
            cur.remove(cur.size() - 1);
        }
    }
}

