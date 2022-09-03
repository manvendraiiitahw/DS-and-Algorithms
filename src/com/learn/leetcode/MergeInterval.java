package com.learn.leetcode;

public class MergeInterval {
    public static void main(String[] args) {
        MergeInterval mergeInterval = new MergeInterval();
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        input = mergeInterval.merge(input);
        for (int[] ints : input) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }

    public int[][] merge(int[][] intervals) {
        int[][] output = new int[intervals.length][intervals[0].length];
        int j = 0;
        int x = intervals[0][0];
        int y = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (y > intervals[i][0]) {
                y = intervals[i][1];
            } else {
                output[j][0] = x;
                output[j][1] = y;
                j++;
                x = intervals[i][0];
                y = intervals[i][1];
            }
        }
        output[j][0] = x;
        output[j][1] = y;
        return output;
    }
}
