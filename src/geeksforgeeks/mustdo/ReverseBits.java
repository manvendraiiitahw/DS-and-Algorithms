package geeksforgeeks.mustdo;

public class ReverseBits {
    public static void main(String[] args) {
//        System.out.println(ReverseBits.reverseBits(10));
//        System.out.println(ReverseBits.checkKthBit(500, 3));
//        System.out.println(ReverseBits.maxConsecutiveOnes(222));
        int[]A = {2, 2, 5, 5, 20, 30, 30};
        System.out.println(ReverseBits.search(A, 7));
    }

    public static int reverseBits(int n) {
        StringBuilder stringBuilder = new StringBuilder("");
        int i;
        while (n > 0) {
            i = n % 2;
            stringBuilder.append(i);
            n = n / 2;
        }
        String str = stringBuilder.toString();
        i = str.length() - 1;
        int j = 0;
        int sum = 0;
        while (i >= 0) {
            sum = (int) (sum + Integer.parseInt(str.charAt(i) + "") * Math.pow(2, j));
            j++;
            i--;
        }

        return sum;
    }

    static boolean checkKthBit(int n, int k) {
        // Your code here
        boolean status = false;
        while (n > 0 && k >= 0) {
            status = (n & 1) == 1;
            n = n >> 1;
            k--;
        }
        return status;
    }

    public static int maxConsecutiveOnes(int N) {

        boolean status;
        int curMax = 0;
        int max = Integer.MIN_VALUE;
        while (N > 0) {
            status = (N & 1) == 1;
            if (status) {
                curMax++;
            } else {
                max = Math.max(curMax, max);
                curMax=0;
            }
            N = N >> 1;
        }
        return Math.max(curMax, max);

    }
    public static int search(int A[], int N)
    {
        int output=A[0];
        for(int i=1;i<N;i++){
            output=output^A[i];
        }
        return output;
    }
}
