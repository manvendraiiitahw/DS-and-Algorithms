package advance.java.leetcode.subscription.heap;

import java.util.Objects;
import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    PriorityQueue<Integer> priorityQueue = null;
    int pqRealSize;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.priorityQueue = new PriorityQueue<>(k);
        this.pqRealSize=k;
        for (int num : nums) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(num);
            } else if (priorityQueue.peek() < num) {
                priorityQueue.poll();
                priorityQueue.add(num);
            }
        }
    }

    public int add(int val) {
        if (priorityQueue.size() < pqRealSize) {
            priorityQueue.add(val);
            return priorityQueue.peek();
        }
        if (Objects.nonNull(priorityQueue) && priorityQueue.peek() < val) {
            priorityQueue.poll();
            priorityQueue.add(val);
        }
        return Objects.nonNull(priorityQueue) ? priorityQueue.peek() : null;
    }

    public static void main(String[] args) {
//        ["KthLargest","add","add","add","add","add"]
//        [[1,[]],[-3],[-2],[-4],[0],[4]]
        int[] arr=new int[0];
        KthLargestElementInAStream stream=new KthLargestElementInAStream(1,arr);
        System.out.println(stream.add(-3));
        System.out.println(stream.add(-2));
        System.out.println(stream.add(-4));
        System.out.println(stream.add(0));
        System.out.println(stream.add(4));

    }
}
