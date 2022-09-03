package advance.java.leetcode.subscription.neetcode.binarysearch;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        BinarySearch_704 binarySearch_704 = new BinarySearch_704();
        System.out.println(binarySearch_704.search(arr, 2));
    }

    public int searchNew(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        return searchUtil(nums, 0, nums.length - 1, target);
    }

    public int searchUtil(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int med = start + (end - start) / 2;
        if (nums[med] == target) {
            return med;
        }
        if (med < end && nums[med] > target) {
            return searchUtil(nums, start, med - 1, target);
        } else {
            return searchUtil(nums, med + 1, end, target);
        }
    }
}
