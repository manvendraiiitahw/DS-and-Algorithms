package com.learn.leetcode;

public class ComputeAndReturnSquareroot {
    public static void main(String[] args) {
        ComputeAndReturnSquareroot squareroot = new ComputeAndReturnSquareroot();
        System.out.println(squareroot.sqrt(83647));
    }

    int sqrt(int n) {
        long t = System.currentTimeMillis();
        int start = 1, end = n, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t);
        return ans;
    }
}
