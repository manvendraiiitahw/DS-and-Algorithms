package advance.java.leetcode.subscription;

public class MoveCounts {
    public static void main(String[] args) {
        MoveCounts moveCounts = new MoveCounts();
        System.out.println(moveCounts.count(3,2));
    }

    int count(int n, int m) {
        if (n == 1 && m == 1) {
            return 1;
        }
        if (n < 1 || m < 1) {
            return 0;
        }
        return 1 + Math.min(count(n - 1, m), count(n, m - 1));
    }
}
