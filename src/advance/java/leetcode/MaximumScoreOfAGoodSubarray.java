package advance.java.leetcode;

import java.util.Stack;

public class MaximumScoreOfAGoodSubarray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 7, 4, 5};
        System.out.println(maximumScore(nums, 3));
    }

    public static int maximumScore(int[] nums, int k) {
        Stack<Integer> s = new Stack<>();
        int max_area = 0; // Initialize max area
        int tp; // To store top of stack
        int area_with_top; // To store area with top bar as the smallest bar
        int i = 0;
        boolean flag = false;
        while (i < nums.length) {
            if (s.empty() || nums[s.peek()] <= nums[i]) {
                s.push(i++);
                flag = false;
            } else {
                tp = s.pop(); // pop the top
                area_with_top = nums[tp] * (s.empty() ? i : i - s.peek() - 1);
                if ((tp >= k || flag) && (i - s.peek()) <= k) {
                    flag = true;
                    if (max_area < area_with_top)
                        max_area = area_with_top;
                }else {
                    while (!s.isEmpty() && nums[s.peek()]< nums[tp]){
                        s.pop();
                    }
                    s.push(tp);
                }
            }
        }
        while (!s.empty()) {
            tp = s.peek();
            s.pop();
            area_with_top = nums[tp] * (s.empty() ? i : i - s.peek() - 1);
            if (i >= k && i - s.peek() <= k) {
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        return max_area;

    }

}
