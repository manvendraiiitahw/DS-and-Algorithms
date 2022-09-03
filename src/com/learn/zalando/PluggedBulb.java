package com.learn.zalando;// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class PluggedBulb {
    public int solution(int[] A) {
        int[] arr = new int[A.length + 1];
	int[] sortedArr = new int[A.length + 1];
	int[] numSortArr = new int[A.length];
	for(int i=0;i<A.length;i++){
		numSortArr[i] = A[i];
	}
	Arrays.sort(numSortArr);
	int output = 0;
	for(int i=0;i<A.length;i++) {
		arr[i+1] = arr[i] + A[i];
		sortedArr[i+1] = sortedArr[i] + numSortArr[i];
		if(arr[i+1] == sortedArr[i+1])
			output++;
	}
	return output;
    }
}
