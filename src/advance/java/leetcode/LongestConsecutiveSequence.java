package advance.java.leetcode;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//        You must write an algorithm that runs in O(n) time.

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longestStreak = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curOut = 1;
                while (set.contains(curNum + 1)) {
                    curOut++;
                    curNum++;
                }
                longestStreak=Math.max(longestStreak,curOut);
            }
        }
        return longestStreak;
    }
}
