package advance.java.leetcode.subscription.neetcode.arrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
//    Input: nums = [100,4,200,1,3,2]
//    Output: 4
//    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
    public int longestConsecutive(int[] nums) {
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
                longestStreak = Math.max(longestStreak, curOut);
            }
        }
        return longestStreak;
    }
}
