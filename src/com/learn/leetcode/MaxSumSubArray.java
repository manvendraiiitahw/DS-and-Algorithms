package com.learn.leetcode;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2147483647};
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        System.out.println(maxSumSubArray.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumSoFar = 0;
        for (int i = 0; i < nums.length; i++) {
            maxSumSoFar = maxSumSoFar + nums[i];
            if (maxSumSoFar > maxSum) {
                maxSum = maxSumSoFar;
            }
            if (maxSumSoFar < 0) {
                maxSumSoFar = 0;
            }
        }
        return maxSum;
    }
}
