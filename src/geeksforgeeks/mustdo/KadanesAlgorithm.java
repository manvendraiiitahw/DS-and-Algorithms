package geeksforgeeks.mustdo;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        KadanesAlgorithm algorithm = new KadanesAlgorithm();
        System.out.println(algorithm.maxSubarraySum(arr, n));
    }

    int maxSubarraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE, maxSumSoFar = 0;
        for (int i = 0; i < n; i++) {
            maxSumSoFar = maxSumSoFar + arr[i];
            if (maxSumSoFar > maxSum) {
                maxSum = maxSumSoFar;
            }
            if(maxSumSoFar< 0){
                maxSumSoFar=0;
            }
        }
        return maxSum;
    }
}
