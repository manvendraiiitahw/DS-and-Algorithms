package advance.java.leetcode.subscription.neetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soldiers {
    public static void main(String[] args) {
        int[][] arr = {{5, 5}, {5, 3}, {4, 5}};

        Soldiers soldiers = new Soldiers();
        System.out.println(soldiers.countBuilding(3, arr));
    }

    int countBuilding(int n, int[][] arr) {
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxX = Math.max(maxX, arr[i][0]);
            maxY = Math.max(maxY, arr[i][1]);
        }
        int[][] input = new int[maxX + 1][maxY + 1];
        boolean[] rowVisited = new boolean[maxX + 1];
        boolean[] colVisited = new boolean[maxY + 1];
        for (int i = 0; i < n; i++) {
            input[arr[i][0]][arr[i][1]] = 1;
        }
        int output = 0;
        for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                if (input[i][j] == 1) {
                    if (!colVisited[j] && !rowVisited[i]) {
                        output = output + 15;
                        colVisited[j] = true;
                        rowVisited[i] = true;
                    } else if (!colVisited[j] && rowVisited[i]) {
                        output = output + 7;
                        colVisited[j] = true;
                    } else if (!rowVisited[i] && colVisited[j]) {
                        output = output + j;
                        rowVisited[i] = true;
                    }
                }
            }
        }
        return output;
    }
}
