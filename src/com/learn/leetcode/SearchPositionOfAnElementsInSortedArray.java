package com.learn.leetcode;

public class SearchPositionOfAnElementsInSortedArray {
    public static void main(String[] args){
        int[] arr={1,3,5,6};
        System.out.println(SearchPositionOfAnElementsInSortedArray.findElements(arr,2,0,arr.length));
    }
    static int findElements(int[] arr, int target, int start, int end){
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (mid > 0 && arr[mid] > target && arr[mid-1] < target){
                return mid+1;
            }
            if (mid < arr.length && mid < arr.length-1 && arr[mid] < target && arr[mid+1] > target){
                return mid+1;
            }
            if (arr[mid] > target)
                return findElements(arr, target,start, mid - 1);
            return findElements(arr, target,mid + 1, end);
        }

        return -1;
    }
}
