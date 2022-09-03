package com.learn.leetcode;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1},{3}}; //{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        SearchA2DMatrix matrix = new SearchA2DMatrix();
        System.out.println(matrix.searchMatrix(arr, 3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > 0) {
                if (matrix[i][0] >= target) {
                    if (i == 0) {
                        return binarySearch(matrix[i], 0, matrix[0].length - 1, target);
                    } else {
                        return binarySearch(matrix[i - 1], 0, matrix[0].length - 1, target);
                    }
                }
            }
        }

        return false;
    }

    public boolean binarySearch(int[] arr, int start, int end, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (target > arr[mid]) {
                return binarySearch(arr, mid + 1, end, target);
            } else {
                return binarySearch(arr, start, mid - 1, target);
            }
        }
        return false;
    }
}
