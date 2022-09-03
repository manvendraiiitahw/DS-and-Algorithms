package datastructure.learning;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        int[] output = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                output[i] = arr[i];
            } else {
                if(i==3) {
                    minHeapify(output, 0, 3);
                }
                if(arr[i]> output[0]) {
                    output[0] = arr[i];
                    minHeapify(output,0,k);
                }
            }
        }
        System.out.println(Arrays.toString(output));


    }

    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void minHeapify(int[] arr, int i, int k) {
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
