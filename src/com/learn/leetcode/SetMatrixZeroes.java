package com.learn.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        setMatrixZeroes.setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    String str = i + "," + j;
                    set.add(str);
                }
            }
        }
        for (String str : set) {
            String[] s = str.split(",");
            int i = Integer.parseInt(s[0]);
            int j = Integer.parseInt(s[1]);
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i][k] = 0;
            }
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][j]= 0;
            }
        }
    }
}
