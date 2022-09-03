package com.learn.leetcode;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] inp = {4,2,0,2,3,2,0};
        nextPermutation(inp);
        for (int i : inp) {
            System.out.println(i);
        }
    }

    static void nextPermutation(int[] nums) {
        int a = -1, b = -1;
        boolean flag = false;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    a = i;
                    b = j;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (a==b) {
            Arrays.sort(nums);
        } else {
            int tmp = nums[a];
            nums[a] = nums[b];
            nums[b] = tmp;
            Arrays.sort(nums, b + 1, nums.length);
        }
    }
}
///
//public class Solution {
//    public void nextPermutation(int[] nums) {
//        int i = nums.length - 2;
//        while (i >= 0 && nums[i + 1] <= nums[i]) {
//            i--;
//        }
//        if (i >= 0) {
//            int j = nums.length - 1;
//            while (j >= 0 && nums[j] <= nums[i]) {
//                j--;
//            }
//            swap(nums, i, j);
//        }
//        reverse(nums, i + 1);
//    }
//
//    private void reverse(int[] nums, int start) {
//        int i = start, j = nums.length - 1;
//        while (i < j) {
//            swap(nums, i, j);
//            i++;
//            j--;
//        }
//    }
//
//    private void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//}
