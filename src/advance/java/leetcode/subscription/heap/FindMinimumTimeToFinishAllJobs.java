package advance.java.leetcode.subscription.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//You are given an integer array jobs, where jobs[i] is the amount of time it takes to complete the ith job.
//        There are k workers that you can assign jobs to. Each job should be assigned to exactly one worker.
//        The working time of a worker is the sum of the time it takes to complete all jobs assigned to them. Your goal is to devise an optimal assignment such that the maximum working time of any worker is minimized.
//        Return the minimum possible maximum working time of any assignment.
//Example 1:
//        Input: jobs = [3,2,3], k = 3
//        Output: 3
//        Explanation: By assigning each person one job, the maximum time is 3.
//        Example 2:
//
//        Input: jobs = [1,2,4,7,8], k = 2
//        Output: 11
//        Explanation: Assign the jobs the following way:
//        Worker 1: 1, 2, 8 (working time = 1 + 2 + 8 = 11)
//        Worker 2: 4, 7 (working time = 4 + 7 = 11)
//        The maximum working time is 11.
public class FindMinimumTimeToFinishAllJobs {
    public static void main(String[] args) {
        FindMinimumTimeToFinishAllJobs toFinishAllJobs = new FindMinimumTimeToFinishAllJobs();
        int[] arr = {5, 5, 4, 4, 4};
        System.out.println(toFinishAllJobs.minimumTimeRequired1(arr, 2));
    }

    public int minimumTimeRequired(int[] jobs, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(k, Comparator.naturalOrder());
        Arrays.sort(jobs);
        int j = 0;
        for (int i = jobs.length - 1; i >= 0; i--) {
            if (j < k) {
                integers.add(jobs[i]);
                j++;
            } else {
                int min = integers.poll() + jobs[i];
                integers.add(min);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Integer num : integers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int min = Integer.MAX_VALUE;

    public int minimumTimeRequired1(int[] jobs, int k) {
        backtraking(jobs, jobs.length - 1, new int[k]);
        return min;
    }

    public void backtraking(int[] jobs, int j, int[] sum) {
        int max = getmax(sum);
        if (max >= min)
            return;
        if (j < 0) {
            min = Math.min(max, min);
            return;
        }
        for (int i = 0; i < sum.length; i++) {
            if (i > 0 && sum[i] == sum[i - 1])
                continue;
            sum[i] += jobs[j];
            backtraking(jobs, j - 1, sum);
            sum[i] -= jobs[j];
        }
    }

    public int getmax(int[] sum) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sum.length; i++)
            max = Math.max(max, sum[i]);
        return max;
    }
}
