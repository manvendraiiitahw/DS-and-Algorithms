package com.learn.leetcode;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,1};//,1,1,0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public void sortColors(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        } else {
            int start = 0, med = 0, end = nums.length - 1;
            while (med <= end) {
                if (nums[med] == 0) {
                    int t = nums[start];
                    nums[start] = nums[med];
                    nums[med] = t;
                    med++;
                    start++;
                }
                else if (nums[med] == 1) {
                    med++;
                }
                else if (nums[med] == 2) {
                    int t = nums[med];
                    nums[med] = nums[end];
                    nums[end] = t;
                    end--;
                }

            }

        }
    }

}
