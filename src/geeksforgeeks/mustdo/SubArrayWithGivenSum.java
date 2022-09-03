package geeksforgeeks.mustdo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(SubArrayWithGivenSum.subarraySum(arr, n, s));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> output = new ArrayList<>();
        if (n == 1 && (arr[0] < s || arr[0] > s)) {
            output.add(-1);
            return output;
        }
        if (n == 1 && arr[0] == s) {
            output.add(1);
            output.add(1);
            return output;
        }
        int l = 0, i = 0, currSum = 0;
        while (i < arr.length) {
            if ((currSum + arr[i]) < s) {
                currSum = currSum + arr[i];
                i++;
            }
            else if ((currSum + arr[i]) > s && l < arr.length) {
                currSum = currSum - arr[l];
                l++;
            }
            else if (currSum == s || (currSum+arr[i])==s) {
                output.add(l+1);
                output.add(i+1);
                return output;
            }
        }
        output.add(-1);

        return output;
    }
}
