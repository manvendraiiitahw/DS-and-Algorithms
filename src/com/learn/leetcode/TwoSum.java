package com.learn.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] output;
        output = TwoSum.twoSum(num, target);
        if (Objects.nonNull(output) && output.length > 1) {
            System.out.println(output[0] + " and " + output[1]);
        } else {
            System.out.println("numbers is not present that make sum to target");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        boolean found = false;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.containsKey(target - nums[i])) {
                if (integerMap.containsKey(nums[i]) && i != integerMap.get(target- nums[i])) {
                    output[1] = i;
                    output[0] = integerMap.get(target - nums[i]);
                    found = true;
                    break;
                }
            }
        }
        return found ? output : null;
    }
}
