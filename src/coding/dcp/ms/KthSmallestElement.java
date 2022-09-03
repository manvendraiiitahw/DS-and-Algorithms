package coding.dcp.ms;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(kthSmallest(arr, k));
        }
    }

    static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(k, Comparator.reverseOrder());
        int i = 0;
        while (priorityQueue.size() < k) {
            priorityQueue.add(arr[i]);
            i++;
        }
        while (i < arr.length) {
            assert priorityQueue.peek() != null;
            if (arr[i] < priorityQueue.peek().intValue()) {
                priorityQueue.remove();
                priorityQueue.add(arr[i]);
            }
            i++;
        }
        return priorityQueue.peek();
    }
}
