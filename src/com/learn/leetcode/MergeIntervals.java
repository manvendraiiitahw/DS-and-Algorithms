package com.learn.leetcode;

import java.util.*;

class Interval {
    int i;
    int j;

    public Interval(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

public class MergeIntervals {
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
//        int[][] arr = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16},{4,8}};
        int[][] arr={};
        List<Interval> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Interval interval = new Interval(arr[i][0], arr[i][1]);
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
//                intervals1.add(int1);
                arrayList.remove(i + 1);
                arrayList.add(i + 1, int1);
            } else {
                intervals1.add(arrayList.get(i));
            }
            i++;
        }
//        if (!intervals1.contains(arrayList.get(arrayList.size() - 1))) {
        if(arr.length>0) {
            intervals1.add(arrayList.get(arrayList.size() - 1));
        }
//        }
        arr = new int[intervals1.size()][2];
        int j = 0;
        for (Interval inter : intervals1) {
            arr[j][0] = inter.i;
            arr[j][1] = inter.j;
            j++;
        }
        System.out.println(arr);
    }

    public int[][] merge(int[][] intervals) {


        return null;
    }
}
