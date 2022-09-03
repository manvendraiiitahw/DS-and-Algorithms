package coding.dcp.ms;

//The problem is to count all the possible paths from top left to bottom right of a MxN matrix with the constraints
// that from each cell you can either move to right or down.


import java.util.Scanner;

public class NumberOfPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(numberOfPath(m, n));
        }

    }

    static int numberOfPath(int m, int n) {

        if (m == 1 && n == 1) {
            return 1;
        } else if (m < 1 || n < 1) {
            return 0;
        } else {
            return numberOfPath(m - 1, n) + numberOfPath(m, n - 1);
        }
    }
}
