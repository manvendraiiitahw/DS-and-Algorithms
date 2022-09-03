package com.learn.leetcode;

public class SearchInRotatedArray {

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (nums[0] <= target)
            return binarySearch(nums, 0, pivot - 1, target);
        return binarySearch(nums, pivot + 1, nums.length - 1, target);


    }

    public static int findPivot(int[] nums, int start, int end) {
        if (end < start)
            return -1;
        if (end == start)
            return start;

        int mid = (start + end) / 2;
        if (mid < end && nums[mid] > nums[mid + 1])
            return mid;
        if (mid > start && nums[mid] < nums[mid - 1])
            return (mid - 1);
        if (nums[start] >= nums[mid])
            return findPivot(nums, start, mid - 1);
        return findPivot(nums, mid + 1, end);
    }

    public static boolean binarySearch(int[] arr, int low, int high, int key) {
        if (high < low)
            return false;

        int mid = (low + high) / 2;
        if (key == arr[mid])
            return true;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    public static void main(String[] args) {
        int[] arr={1,1,3};
        System.out.println(search(arr,3));
    }

}