package com.learn.leetcode;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int[] num = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        System.out.println(threeSum(num));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Map<List<Integer>, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int x = nums[i];
            while (l < r) {
                if (x + nums[l] + nums[r] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(x);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    Collections.sort(list);
                    if (!map.containsKey(list)) {
                        output.add(list);
                        map.put(list, list);
                    }
                    l++;
                    r--;
                } else if (x + nums[l] + nums[r] < 0)
                    l++;
                else
                    r--;
            }
        }


//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[   k] == 0) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        Collections.sort(list);
//                        if (!map.containsKey(list)) {
//                            output.add(list);
//                            map.put(list, list);
//                        }
//                    }
//                }
//            }
//        }
        return output;
    }
}
