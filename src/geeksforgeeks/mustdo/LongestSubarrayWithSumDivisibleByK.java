package geeksforgeeks.mustdo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {-2, 2, -5, 12, -11, -1, 7};
        System.out.println(LongestSubarrayWithSumDivisibleByK.longSubarrWthSumDivByK(arr, arr.length, 3));
    }

    static int longSubarrWthSumDivByK(int a[], int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] modulus = new int[n];
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            modulus[i] = (sum % k) % k;
        }
        for (int i = 0; i < a.length; i++) {
            if (modulus[i] == 0) {
                max = i + 1;
            } else if (!map.containsKey(modulus[i])) {
                map.put(modulus[i], i);
            } else {
                if (max < (i - map.get(modulus[i]))) {
                    max = (i - map.get(modulus[i]));
                }
            }
        }
        return max;
    }

}
