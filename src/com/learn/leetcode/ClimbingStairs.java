package com.learn.leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(40));
    }

    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
//        if (n == 0) {
//            return 1;
//        }
//        if (n < 0) {
//            return 0;
//        } else
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        165580141
    }
}
