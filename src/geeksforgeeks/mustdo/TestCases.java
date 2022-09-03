package geeksforgeeks.mustdo;

public class TestCases {

    /*
     * public static int FindMin(int a[])
     * Returns the smallest number in array that has been rotated
     * For example - Array {3,4,5,6,1,2} returns 1
     * Input array was originally sorted in increasing orders
     * FindMin must have O(log n) runtime
     * Assume array does not have any duplicates.
     */

    public static int FindMin(int a[]) {
        return pivot(a, 0, a.length - 1);
    }

    public static int pivot(int[] a, int s, int n) {

        if (n < s) {
            return a[s];
        }
        if (s == n) return a[s];
        int m = (s + n) / 2;

        if (m < n && a[m+1] < a[m]) {
            return a[m+1];
        }
        if (m > s && a[m] < a[m - 1])
            return a[m];

        if (a[n] > a[m]) {
            return pivot(a, s, m-1);
        } else {
            return pivot(a, m + 1, n);
        }

        // Check if element (mid+1) is minimum element. Consider

    }


    public static boolean doTestsPass() {
        /*
         * int doTestsPass()
         * Returns 1 if all tests pass. Otherwise returns 0.
         */

        boolean result = true;
        result = result && FindMin(new int[]{3, 4, 5, 6, 1, 2}) == 1;
        result = result && FindMin(new int[]{2, 1}) == 1;
        result = result && FindMin(new int[]{1}) == 1;

        try {
            FindMin(null);
            result = false;
        } catch (Exception e) {
            result = result && true;
        }

        if (result) {
            System.out.println("All tests pass\n");
        } else {
            System.out.println("There are test failures\n");
        }
        return result;
    }

    //Execution entry point.
    public static void main(String args[]) {
        doTestsPass();
    }
}
