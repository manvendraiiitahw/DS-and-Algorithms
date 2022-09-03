package com.learn.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] inp={0,0,1};
        System.out.println(removeDuplicates(inp));
    }

    public static int removeDuplicates(int[] nums) {
        int output=1;

        for (int i=1;i<nums.length;i++){
            while (nums[i-1]==nums[i]){
                i++;
            }
            output++;
        }

        return output;
    }
}
