package advance.java.leetcode;

public class RotateMatrixCloseWise {
    public static void main(String[] args) {
        int[][] mt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println("Before rotate");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
        rotate(mt);
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        transpose(matrix);
        System.out.println("After rotate");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[i].length-1;
            while (low < high) {
                int t = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = t;
                low++;
                high--;
            }
        }
    }
}
