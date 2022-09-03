package advance.java.leetcode;

//Given two integer arrays Arr1 and Arr2 of size N. Use the greatest elements from the given arrays to create a new array of
// size N such that it consists of only unique elements and the sum of all its elements is maximum.
//        The created elements should contain the elements of Arr2 followed by elements of Arr1 in order of their appearance.

import java.util.*;

public class MaximizeTheArray {
    public static void main(String[] args) {
        int[] Arr1 = {5 ,6 ,9 ,3 ,7 ,4 ,5};
        int[] Arr2 = {2 ,5 ,4 ,7 ,4 ,4 ,3};
        System.out.println(maximizeArray(Arr1, Arr2, 7));
    }

    static ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
        Set<Integer> integers = new HashSet<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int i : arr2) {
            if(!integers.contains(i)) {
                queue.add(i);
                integers.add(i);
            }
        }
        for (int i : arr1) {
            if(!queue.contains(i) && queue.size()< n){
                queue.add(i);
            }
            else if (queue.size()== n && !queue.contains(i) && i > queue.peek()) {
                queue.poll();
                queue.add(i);
            }
        }
        integers=new HashSet<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (int i : arr2) {
            if (!integers.contains(i) && queue.contains(i)) {
                output.add(i);
                integers.add(i);
            }
        }
        for (int i : arr1) {
            if (!integers.contains(i) && queue.contains(i)) {
                output.add(i);
                integers.add(i);
            }
        }
        return output;
    }


    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void minHeapify(int arr[], int i, int k) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;
        if (left < k && arr[left] < arr[i]) {
            largest = left;
        }
        if (right < k && arr[right] < arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            minHeapify(arr, largest, k);
        }

    }
}
