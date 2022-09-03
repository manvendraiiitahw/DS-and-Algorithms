package com.learn.leetcode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args){
        int[] arr={0,0,0,1,2,3};
        int tar=0;
        System.out.println(searchRange(arr, tar).toString());
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] output=new int[2];
        if(nums.length==0){
            output[0]=-1;
            output[1]=-1;
            return output;
        }
        search(output,nums,0, nums.length, target);
        return output;
    }
    private static void search(int[] output, int[] nums, int start, int end, int target){
        if(end< start){
            output[0]=-1;
            output[1]=-1;
            return;
        }
        int med=(start+end)/2;
        if(med>=nums.length){
            output[0]=-1;
            output[1]=-1;
            return;
        }
        if(nums[med]==target){
            int i=med;
            while (i>=0 && nums[i]==target){
                i--;
            }
            output[0]=i+1;
            boolean st=false;
            while (med < nums.length && nums[med]==target){
                med++;
                st=true;
            }
            output[1]= st ?med-1:med;
            return;
        }
        if(nums[med]< target){
            search(output,nums,med+1, end, target);
        }else{
            search(output,nums,start, med-1, target);
        }
    }
}
