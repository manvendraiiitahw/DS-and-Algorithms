package advance.java.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
// You can only see the k numbers in the window. Each time the sliding window moves right by one position.
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] inp = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(inp, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] out = new int[nums.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        if (nums.length < 3) {
            return new int[0];
        }
        int i = 0;
        while (i < k) {
            pq.add(nums[i]);
            i++;
        }
        int j = 0;
        out[j] = pq.peek();
        j++;
        pq.remove(nums[0]);
        for (int a = i; a < nums.length; a++) {
            pq.add(nums[a]);
            out[j] = pq.peek();
            pq.remove(nums[j]);
            j++;
        }
        return out;
    }
}
