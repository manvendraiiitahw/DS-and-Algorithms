package advance.java.leetcode.subscription.neetcode.binarysearch;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray minimum = new FindMinimumInRotatedSortedArray();
        int[] arr = {7, 2};
        System.out.println(minimum.findMin(arr));
    }

    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[r] > nums[l]) {
            return nums[0];
        }
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[m + 1]) {
                return nums[m + 1];
            }
            if (nums[m - 1] > nums[m]) {
                return nums[m];
            }

            if (nums[m] > nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
