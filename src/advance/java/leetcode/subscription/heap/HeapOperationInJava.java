package advance.java.leetcode.subscription.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapOperationInJava {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        int i = 0;
        while (i < k) {
            minHeap.add(nums[i]);
            i++;
        }
        while (i < nums.length) {
            if (minHeap.peek() < nums[i]) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
            i++;
        }
        return minHeap.peek();

    }

    public static void main(String[] args) {

        HeapOperationInJava inJava=new HeapOperationInJava();
        int[] arr={3,2,3,1,2,4,5,5,6};
        System.out.println(inJava.findKthLargest(arr,4));
//        // Construct an empty Min Heap
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(5);
//
//// Construct an empty Max Heap
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//
//// Construct a Heap with initial elements.
//// This process is named "Heapify".
//// The Heap is a Min Heap
//        PriorityQueue<Integer> heapWithValues = new PriorityQueue<>(Arrays.asList(3, 1, 2));
//
//
//        //Insertion in heap
//        minHeap.add(1);
//        maxHeap.add(2);
//
//        //Get top element from heap
//        minHeap.peek();
//        maxHeap.peek();
//
//        //delete an element from heap
//        minHeap.poll();
//        maxHeap.poll();
//
//        // Length of the Min Heap
//        minHeap.size();
//
//        // Length of the Max Heap
//        maxHeap.size();
    }
}
