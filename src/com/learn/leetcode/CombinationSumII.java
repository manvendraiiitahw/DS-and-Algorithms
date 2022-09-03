package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//Each number in candidates may only be used once in the combination.
public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,6,3,5,1};
        int sum = 9;

        CombinationSumII sum1 = new CombinationSumII();
        System.out.println(sum1.combinationSum(arr, sum));

    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new Stack<>();
        process(candidates, res, cur, target,0);
        return res;
    }

    static void process(int[] arr, List<List<Integer>> res, List<Integer> cur, int target, int i) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList(cur));
        }
        while (i < arr.length) {
            cur.add(arr[i]);
            process(arr, res, cur, target-arr[i], i++);
            cur.remove(cur.size() - 1);
        }
    }
}

