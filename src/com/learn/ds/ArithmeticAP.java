package com.learn.ds;

import java.util.Arrays;

public class ArithmeticAP {
    public static void main(String[] args) {
        int[] ar = {1, 7, 10, 15, 27, 29, 43};
        System.out.println(ArithmeticAP.findAP(ar, 7));
    }

    static int findAP(int[] ar, int n) {
        int ans = 2;
        Arrays.sort(ar);
        int[] lp = new int[n];
        for (int i = 0; i < n; i++) {
            lp[i] = 2;
        }
        for (int j = n - 2; j > 0; j--) {
            int i = j - 1;
            int k = j + 1;
            while (i >= 0 && k < n) {
                if (ar[i] + ar[k] == 2 * ar[j]) {
                    lp[j] = Math.max(lp[k] + 1, lp[j]);
                    ans = Math.max(ans, lp[j]);
                    k++;
                    i--;
                } else if (ar[i] + ar[k] > 2 * ar[j]) {
                    i--;
                } else {
                    k++;
                }
            }
        }
        return ans;
    }
}
