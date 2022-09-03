package advance.java.leetcode;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4,5,2,1,0};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean increasing = false;
        boolean decreasing = false;
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1] && !decreasing) {
                increasing = true;
            } else if (arr[i] > arr[i + 1] && increasing) {
                decreasing = true;
            } else {
                return false;
            }
            i++;
        }
        return decreasing;
    }
}
