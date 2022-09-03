package com.learn.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] inp = {1,1,1};
        System.out.println(maxArea(inp));
    }

    public static int maxArea(int[] height) {

        int left=0, right=height.length-1;
        int output=0,maxArea;
        while (left<right){
            maxArea=Math.min(height[left], height[right]) * ((right-left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            if(maxArea> output){
                output=maxArea;
            }
        }

//        int[] arr = new int[height.length];
//        arr[0] = height[0];
//        int max = height[0];
//        for (int i = 1; i < height.length; i++) {
//            arr[i] = max;
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        int maxArea, output=0;
//        for (int i = 1; i < height.length; i++) {
//            if(arr[i]==height[i]){
//                maxArea = arr[i]*i;
//                if (maxArea > output) {
//                    output = maxArea;
//                }
//            }
//            else {
//                maxArea = height[i] * (i - arr[i]);
//                if (maxArea > output) {
//                    output = maxArea;
//                }
//            }
//        }
        return output;
    }

}
