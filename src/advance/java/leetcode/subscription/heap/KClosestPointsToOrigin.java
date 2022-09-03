package advance.java.leetcode.subscription.heap;

//Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
//        The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
//        You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

import com.learn.ds.PowerOf2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    class PointsVal {
        int x, y;
        double dist;

        public PointsVal(int x, int y, double dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3,3},{5,-1},{-2,4}};
        KClosestPointsToOrigin pointsToOrigin = new KClosestPointsToOrigin();
        System.out.println(Arrays.deepToString(pointsToOrigin.kClosest(arr, 2)));
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<PointsVal> integers = new PriorityQueue<>(k, new Comparator<PointsVal>() {
            @Override
            public int compare(PointsVal o1, PointsVal o2) {
                return Double.compare(o2.dist, o1.dist);
            }
        });
        for (int i = 0; i < points.length; i++) {
            if (i < k) {
                double dist = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
                integers.add(new PointsVal(points[i][0], points[i][1], dist));
            } else {
                PointsVal pointsVal = integers.peek();
                double dist = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
                if (Objects.nonNull(pointsVal) && dist < pointsVal.dist) {
                    integers.poll();
                    integers.add(new PointsVal(points[i][0], points[i][1], dist));
                }
            }
        }

        int[][] output = new int[k][2];
        int i = 0;
        while (!integers.isEmpty()) {
            int[] o = new int[2];
            PointsVal pointsVal = integers.poll();
            o[0] = pointsVal.x;
            o[1] = pointsVal.y;
            output[i] = o;
            i++;
        }

        return output;
    }
}
