package advance.java.leetcode.subscription.neetcode.stack;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        arr = dailyTemperatures.dailyTemperatures(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 0) {
            return new int[0];
        }
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int curTemp = temperatures[i];
            while (!stack.isEmpty() && curTemp > temperatures[stack.peek()]) {
                int days = stack.pop();
                ans[days] = i - days;
            }
            stack.push(i);
        }
        return ans;
    }
}
