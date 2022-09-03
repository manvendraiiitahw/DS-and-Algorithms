package com.learn.leetcode;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        System.out.println(minimumPathSum.minimumPathSum(arr));
    }

    public int minimumPathSum(int[][] arr) {
        int[] dp = new int[arr[0].length];
        dp[0] = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[arr.length - 1];


    }
}
