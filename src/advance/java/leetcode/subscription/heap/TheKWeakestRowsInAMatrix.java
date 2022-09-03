package advance.java.leetcode.subscription.heap;

//You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
// The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
//        A row i is weaker than a row j if one of the following is true:
//        The number of soldiers in row i is less than the number of soldiers in row j.
//        Both rows have the same number of soldiers and i < j.
//        Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.


import java.util.*;

public class TheKWeakestRowsInAMatrix {
    class Frequency {
        int row;
        int soldiers;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        TheKWeakestRowsInAMatrix inAMatrix = new TheKWeakestRowsInAMatrix();
        System.out.println(Arrays.toString(inAMatrix.kWeakestRows(arr, 3)));

    }

    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (map.containsKey(i)) {
                    if (mat[i][j] == 1) {
                        map.put(i, map.get(i) + 1);
                    }
                } else {
                    map.put(i, mat[i][j]);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

        int[] output = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (i < k) {
                output[i] = entry.getKey();
                i++;
            } else {
                break;
            }
        }
        return output;
    }
}
