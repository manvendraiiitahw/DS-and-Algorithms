package advance.java.leetcode.subscription.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//You have some number of sticks with positive integer lengths. These lengths are given as an array sticks, where sticks[i] is the length of the ith stick.
//        You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y.
//        You must connect all the sticks until there is only one stick remaining.
//        Return the minimum cost of connecting all the given sticks into one stick in this way.
public class MinimumCostToConnectSticks {
    public static void main(String[] args) {
        int[] arr = {2,3};
        MinimumCostToConnectSticks costToConnectSticks = new MinimumCostToConnectSticks();
        System.out.println(costToConnectSticks.connectSticks(arr));
    }

    public int connectSticks(int[] sticks) {
        if (sticks.length < 2) {
            return 0;
        }
        PriorityQueue<Integer> integers = new PriorityQueue<>(sticks.length);
        for (int i : sticks) {
            integers.add(i);
        }
        int output = 0;

        while (!integers.isEmpty()) {
            int first = integers.poll();
            if (integers.size() > 0) {
                first = first + integers.poll();
                output = output + first;
            }
            if (integers.isEmpty()) {
                break;
            }
            integers.add(first);
        }
        return output;
    }
}
