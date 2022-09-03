package geeksforgeeks.mustdo;

import java.util.*;
import java.util.stream.Collectors;

public class CountTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        CountTheTriplets triplets = new CountTheTriplets();
        System.out.println(triplets.countTriplet(arr, n));

    }

    int countTriplet(int[] arr, int n) {
        if (arr.length < 3) {
            return 0;
        }
        Set<Integer> integers = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            integers.add(arr[i]);
        }
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (integers.contains(arr[i] + arr[j])) {
                    output++;
                }
            }
        }

        return output;
    }
}
