package com.learn.zalando;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int curVal = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            for (int j = i + 2; j < A.length; j++) {
                int sum = A[i] + A[j];
                if (sum < curVal && (j - i > 1)) {
                    curVal = sum;
                }
            }
        }
        return curVal;
    }
    int FindMaxSum(int arr[], int n)
    {
        int incl = arr[1];
        int excl = arr[1];
        int excl_new;
        int i;

        for (i = 3; i < n; i++)
        {
            excl_new = Math.min(incl, excl);
            incl = excl + arr[i];
            excl = excl_new;
        }
        return (Math.min(incl, excl));
    }


    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = 5;
        A[1] = 2;
        A[2] = 4;
        A[3] = 6;
        A[4] = 3;
        A[5] = 7;
//        A[6] = 8;
        MinAvgTwoSlice MinAvgTwoSlice = new MinAvgTwoSlice();
        System.out.println(MinAvgTwoSlice.solution(A));
        System.out.println(MinAvgTwoSlice.FindMaxSum(A, 6));
    }
}