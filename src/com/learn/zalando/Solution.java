package com.learn.zalando;// you can also use imports, for example:

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//An array A consisting of N integers is given.
// We are  looking for pairs of elements of the array that are equal
// but that occupy different positions in the array. More formally, a pair of indices (P,Q) is called identical
// if 0<=P<Q<N and A[P] = A[Q]. The goal is to calculate the number of identical pairs of indices
class Solution {
    public int solution(int[] A) {
        int count = 0;

        for (int P = 0; P < A.length - 1; P++) {
            for (int Q = P + 1; Q < A.length; Q++) {
                if (A[P] == A[Q]) {
                    count++;
                }
            }
        }
        if (count > 1000000000) {
            return 1000000000;
        } else {
            return count;
        }

    }
}
