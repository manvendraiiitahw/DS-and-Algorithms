package com.learn.leetcode;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(arr));
    }

    public int trap(int[] height) {
        if(height.length<3){
            return 0;
        }
        int[] lr = new int[height.length];
        int[] rl = new int[height.length];
        int max = height[0];
        lr[0] = max;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
            lr[i] = max;
        }
        max = height[height.length - 1];
        rl[height.length - 1] = max;
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > max) {
                max = height[i];
            }
            rl[i] = max;
        }

        int output = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(lr[i], rl[i]);
            output = output + min - height[i];
        }
        return output;

    }
}
