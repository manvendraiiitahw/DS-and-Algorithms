package com.learn.leetcode;

import java.util.Arrays;

public class ClosestSum3ToTarget {
    public static void main(String[] args) {
        int[] num = {1,1,-1,-1,3};
        System.out.println(threeSumClosest(num, -1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minTarget = 999999999;
        for (int i = 0; i < nums.length-2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int x = nums[i];
            while (l < r) {
                int sum = x + nums[l] + nums[r];
                if ((Math.abs(target - sum) < Math.abs(target - minTarget))) {
                    minTarget = sum;
                }
                if (sum > target) {
                    r--;
                } else {
                    l++;
                }

            }
        }
        return minTarget;
    }
}
