package com.learn.leetcode;

public class SpiralMatrixFillUp {
    public static void main(String[] args) {
        spiralMatrix(4);
    }

    static int[][] spiralMatrix(int n) {
        int[][] arr = new int[n][n];
        int fr = 0;
        int fc = 0;
        int lr = n;
        int lc=n;
        int num = 1;

        while (fr < lr && fc < lc) {

            for (int i = fc; i < lc; i++) {
                arr[fr][i] = num++;
            }
            fr++;
            for (int i = fr; i < lr; i++) {
                arr[i][lc - 1] = num++;
            }
            lc--;
            if (fr < lr) {
                for (int i = lc - 1; i >= fc; i--) {
                    arr[lr - 1][i] = num++;
                }
                lr--;
            }
            if (fc < lc) {
                for (int i = lr - 1; i >= fr; i--) {
                    arr[i][fc] = num++;
                }
                fc++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }


        return arr;
    }
}
