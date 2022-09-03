package advance.java.gudiya;


import java.util.Arrays;

public class Solution2 {

    public static int solution(int[] A) {

        int count = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if ((Math.abs(A[i] - (i + 1))) > 0) {
                count = count + Math.abs(A[i] - (i+1));
            }
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] a = {1,2,1};
        int n = a.length;

        System.out.println(solution(a));
    }
}