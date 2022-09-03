package advance.java.leetcode;

import java.util.Scanner;

public class SearchInSortedAndRotatedArray {
// { Driver Code Starts
//Initial Template for Java

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int A[] = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();

            System.out.println(new SolutionNew1().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class SolutionNew1 {
    int search(int A[], int l, int h, int key) {
        // Complete this function
        int pivot = findPivot(A, l, h);
        if (pivot == -1) {
            return binarySearch(A, l, h, key);
        }
        if (A[pivot] == key) {
            return pivot;
        }
        if (A[0] <= key) {
            return binarySearch(A, 0, pivot - 1, key);
        } else {
            return binarySearch(A, pivot + 1, h, key);
        }
    }

    int findPivot(int A[], int l, int h) {
        if (h < l) {
            return -1;
        }
        if (h == l) {
            return l;
        }
        int m = (h + l) / 2;
        if (m < h && A[m] > A[m + 1]) {
            return m;
        }
        if (m > l && A[m] < A[m - 1]) {
            return m - 1;
        }
        if (A[l] >= A[m]) {
            return findPivot(A, l, m - 1);
        } else {
            return findPivot(A, m + 1, h);
        }
    }

    int binarySearch(int A[], int l, int h, int key) {
        if (h < l) {
            return -1;
        }
        int m = (h + l) / 2;
        if (A[m] == key) {
            return m;
        }
        if (key > A[m]) {
            return binarySearch(A, m + 1, h, key);
        } else {
            return binarySearch(A, l, m - 1, key);
        }
    }
}