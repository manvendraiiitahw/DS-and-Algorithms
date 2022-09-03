package com.learn.leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII duplicates = new RemoveDuplicatesFromSortedArrayII();
        int[] arr = {1, 1, 2, 2, 2,2, 3, 4, 5, 5, 5};
        System.out.println(duplicates.removeDuplicates(arr));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1 || nums.length == 2) {
            return nums.length;
        }
        int len = 0, curCount = 1;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                if (curCount < 2) {
                    curCount++;
                } else {
                    nums[i - curCount] = Integer.MIN_VALUE;
                }
            } else {
                curCount = 1;
            }
            i++;
        }
        for (int num : nums) {
            if (num != Integer.MIN_VALUE) {
                len++;
            }
        }
        return len;
    }
}
