package com.learn.array;

import java.util.ArrayList;
import java.util.List;

//Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.
public class BooleanMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 0},
                {1, 1, 0, 0}};
        BooleanMatrix.booleanMatrix(arr);
    }

    //is 1 then all the cells in its ith row and jth column will become 1.
    static void booleanMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] rc=new int[r];
        int[] cr=new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    rc[i]=1;
                    cr[j]=1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(rc[i]==1 || cr[j]==1){
                    matrix[i][j]=1;
                }

            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
