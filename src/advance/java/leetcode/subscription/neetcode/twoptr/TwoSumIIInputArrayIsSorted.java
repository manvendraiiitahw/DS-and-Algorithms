package advance.java.leetcode.subscription.neetcode.twoptr;

//leetcode:167
public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,4,9,56,90};
        TwoSumIIInputArrayIsSorted isSorted = new TwoSumIIInputArrayIsSorted();
        int[] output = isSorted.twoSum(input, 8);
        System.out.println(output[0] + " " + output[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int i = 0, end = numbers.length - 1;
        while (i < end) {
            if (numbers[i] + numbers[end] == target) {
                output[0] = i + 1;
                output[1] = end + 1;
                break;
            }
            if (numbers[i] + numbers[end] > target) {
                end--;
            } else {
                i++;
            }
        }
        return output;
    }

    int binarySearch(int[] numbers, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (mid <= end && numbers[mid] == target) {
            return mid;
        }
        if (mid <= end && target > numbers[mid]) {
            return binarySearch(numbers, target, mid + 1, end);
        } else {
            return binarySearch(numbers, target, start, mid - 1);
        }

    }
}
