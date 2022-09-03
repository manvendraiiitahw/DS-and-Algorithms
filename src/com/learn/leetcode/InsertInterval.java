package com.learn.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertInterval {
    static class Interval {
        int i;
        int j;

        public Interval(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 4}, {4, 5}};//, {8, 10}, {15, 18}};
        int[][] intervals = {};
        int[] newInterval = {1, 2};
        List<Interval> arrayList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            Interval interval = new Interval(intervals[i][0], intervals[i][1]);
            arrayList.add(interval);
        }
        if (newInterval.length > 1) {
            Interval interval = new Interval(newInterval[0], newInterval[1]);
            arrayList.add(interval);
        }
        Collections.sort(arrayList, (o1, o2) -> o1.i - o2.i);
        int i = 0;
        boolean override = false;
        List<Interval> intervals1 = new ArrayList<>();
        while (i < arrayList.size() - 1) {
            if (arrayList.get(i).j >= arrayList.get(i + 1).i) {
                int d = Math.max(arrayList.get(i + 1).j, arrayList.get(i).j);
                Interval int1 = new Interval(arrayList.get(i).i, d);
                arrayList.remove(i + 1);
                arrayList.add(i + 1, int1);
            } else {
                intervals1.add(arrayList.get(i));
            }
            i++;
        }
        if (intervals.length > 0 || newInterval.length > 0) {
            intervals1.add(arrayList.get(arrayList.size() - 1));
        }
        intervals = new int[intervals1.size()][2];
        int j = 0;
        for (Interval inter : intervals1) {
            intervals[j][0] = inter.i;
            intervals[j][1] = inter.j;
            j++;
        }
//        return intervals;
        System.out.println(intervals);
    }
}
