package com.learn;

public class FirstAndLastPositionInSortedArray {

  public static void main(String[] args) {

    int[] num = new int[]{5, 7, 7, 8, 8, 10};
    int target = 6;
    binarySearch(num, 0, num.length, target);
  }

  public static int[] binarySearch(int[] arr, int start, int end, int target) {

    if (end >= start) {
      int mid = start + end / 2;
      if (arr[mid] == target) {
        int a = mid;
        while (mid >= 0 && arr[mid] == target) {
          mid = mid - 1;
        }
        mid = mid + 1;
        while (a < arr.length && arr[a] == target) {
          a = a + 1;
        }
        a = a - 1;
        return new int[]{mid, a};
      } else if (arr[mid] > target) {
        binarySearch(arr, start, mid - 1, target);
      } else {
        binarySearch(arr, mid + 1, end, target);
      }
    }
    return new int[]{-1, -1};
  }


}
