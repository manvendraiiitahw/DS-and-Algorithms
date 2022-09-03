package com.learn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
public class FourSumProblem {
    static class Pair {
        int f;
        int s;

        public Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> output = FourSumProblem.fourSum(num, 0);
        System.out.println(output);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return null;
        }
        List<List<Integer>> output = new ArrayList<>();
        Map<Integer, List<Pair>> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = (nums[i] + nums[j]);
                if (map.containsKey(target - sum)) {
                    for (Pair p : map.get(target - sum)) {
                        if (p.s != i && p.s != j && p.f != j && p.f != i) {
                            List<Integer> tpo = new ArrayList<>();
                            tpo.add(i);
                            tpo.add(j);
                            tpo.add(p.f);
                            tpo.add(p.s);
                            output.add(tpo);
                        }

                    }
                } else {
                    map.putIfAbsent(sum, new ArrayList<>());
                    map.get(sum).add(new Pair(i, j));
                }
            }
        }
        return output;
    }
}
