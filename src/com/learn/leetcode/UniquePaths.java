package com.learn.leetcode;

public class UniquePaths {
    public static void main(String[] args) {
        UniquePaths paths = new UniquePaths();
        System.out.println(paths.uniquePaths(3, 7));
    }

    public int uniquePaths(int m, int n) {
//        if (m == 1 || n == 1) {
//            return 1;
//        } else {
//            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
//        }
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}
