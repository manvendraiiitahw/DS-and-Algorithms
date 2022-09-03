package advance.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class TestClass {

    // Find maximum length sub-array with sum S present in the given array
    public static int subArraySum(List<Integer> prices, int sum) {
        int curr_sum = prices.get(0), max_sum = 0, start = 0;
        int icurr_sum = 0, imax_sum = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (curr_sum <= sum) {
                max_sum = Math.max(max_sum, curr_sum);
                icurr_sum = i - start;
                if (imax_sum < icurr_sum) {
                    imax_sum = icurr_sum;
                }
            }
            while (curr_sum + prices.get(i) > sum && start < i) {
                curr_sum -= prices.get(start);
                start++;
            }
            curr_sum += prices.get(i);
        }
        if (curr_sum <= sum) {
            icurr_sum = prices.size() - start;
            if (imax_sum < icurr_sum) {
                imax_sum = icurr_sum;
            }
        }
        return imax_sum;
    }

//    public static int anagramDifference(String s1, String s2) {
//      if(s1.length() != s2.length()) {
//      return -1; 
//        }
//        int count = 0; 
//        Map<Character, Integer> map = new HashMap<>();
//        char[] charCount = new char[26];
//        for (int i = 0; i < s1.length(); i++) { 
//            if (map.containsKey(s1.charAt(i))) {
//                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
//            } else {
//                map.put(s1.charAt(i), 1);
//            }
//        } 
//        for (int i = 0; i < s2.length(); i++) { 
//            if (map.containsKey(s2.charAt(i))) {
//                map.put(s1.charAt(i), map.get(s1.charAt(i)) - 1);
//            } else {
//                map.put(s1.charAt(i), -1);
//            }
//             } 
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//             count = count + entry.getValue();
//        }
//        return count;
//
//             } 

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[]{2, 3, 5, 1, 1, 2, 1});
        int sum = 7;

//        System.out.println(subArraySum(A, sum));
//        System.out.println(anagramDifference("aaa", "bbb"));
//       maxLen(A,sum);
    }

    static void maxLen(int arr[], int n) {
        int start = 0, end = 0, sum = 0, fStart = 1, fEnd = -1;
        int curMax = 0;
        int curMin = 0, output = 0;
        int i = 0;
        while (i < arr.length) {
            if (sum + arr[i] <= n) {
                sum = sum + arr[i];
            }
            if (sum == n) {
                curMax = i;
                if ((curMax - curMin) > output) {
                    output = curMax - curMin;
                }
            }
            if (sum + arr[i] > n) {
                while (sum + arr[i] > n) {
                    sum = sum - arr[curMin];
                    curMin++;
                }
                curMin = i;
                sum = sum + arr[i];
            }


        }
    }
}