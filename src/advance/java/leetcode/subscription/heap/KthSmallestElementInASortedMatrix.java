package advance.java.leetcode.subscription.heap;

//Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
//        Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//        You must find a solution with a memory complexity better than O(n2).

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    class TrippletClass {
        short r, c;
                int value;

        public TrippletClass(short r, short c, int value) {
            this.r = r;
            this.c = c;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        KthSmallestElementInASortedMatrix inASortedMatrix = new KthSmallestElementInASortedMatrix();
        System.out.println(inASortedMatrix.kthSmallest(arr, 8));
    }

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<TrippletClass> priorityQueue = new PriorityQueue<>(Math.min(matrix[0].length, k), Comparator.comparingInt(o -> o.value));
        for (short i = 0; i < Math.min(matrix.length, k); i++) {
            priorityQueue.add(new TrippletClass(i, (short) 0, matrix[i][0]));
        }
        TrippletClass aClass=priorityQueue.peek();
        while (k-- > 0) {
            aClass=priorityQueue.poll();
            assert aClass != null;
            short col = aClass.c;
            if (col < matrix.length-1) {
                priorityQueue.add(new TrippletClass(aClass.r, (short) (col + 1), matrix[aClass.r][col + 1]));
            }
        }
        assert aClass != null;
        return aClass.value;
    }
}
