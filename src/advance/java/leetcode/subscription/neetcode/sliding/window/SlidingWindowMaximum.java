package advance.java.leetcode.subscription.neetcode.sliding.window;

//239
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        input = slidingWindowMaximum.maxSlidingWindow(input, 3);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length % k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        int[] left = new int[nums.length];
        left[0] = nums[0];
        int[] right = new int[nums.length];
        right[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            if (i % k == 0) {
                left[i] = nums[i];
            } else {
                left[i] = Math.max(left[i - 1], nums[i]);
            }
            int j = nums.length - i - 1;
            if ((j+1) % k == 0) {
                right[j] = nums[j];
            } else {
                right[j] = Math.max(right[j + 1], nums[j]);
            }
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length-k+1; i++) {
            output[i] = Math.max(left[i], right[i]);
        }
        return output;

    }
}
