package coding.dcp.ms;

import java.util.HashMap;
import java.util.Map;

public class NumbersWithEqualDigitSum {
    public static void main(String[] args) {
        int[] arr= {51,32,43};//{42,33,60}; //{51,71,17,42};
        System.out.println(NumbersWithEqualDigitSum.numbersWithEqualDigitSum(arr));
    }

    static int numbersWithEqualDigitSum(int[] arr) {
        int curSum, maxSum = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            int digitSum = NumbersWithEqualDigitSum.digitSum(n);
            if (map.containsKey(digitSum)) {
                curSum = map.get(digitSum) + n;
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
                if (map.get(digitSum) < n) {
                    map.put(digitSum, n);
                }
            } else {
                map.put(digitSum, n);
            }
        }
        return maxSum;
    }

    static int digitSum(int d) {
        int sum = 0;
        while (d > 0) {
            sum = sum + d % 10;
            d = d / 10;
        }
        return sum;
    }
}
