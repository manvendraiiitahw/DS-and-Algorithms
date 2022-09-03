package com.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestInStream {
    static int k = 3;
    static int[] arr = new int[k];

    public static void kthLargestElements(int[] arr, int el, int k) {
        if (arr.length < 3) {
            arr[arr.length + 1] = el;
        } else {
            minHeapify(arr, k / 2 - 1, k);
            System.out.println(arr[0]);
            if (arr[0] < el) {
                arr[0] = el;
            }
        }

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

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> a1 = integerList.subList(0, 1);
//    integerList.remove()

        Scanner scan = new Scanner(System.in);
        System.out.println("kth largest elements\n");
        int n, i;
        n = scan.nextInt();
//    int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            int j = scan.nextInt();
            if (i < 3) {
                arr[i] = j;
            } else {
                kthLargestElements(arr, j, k);
            }

        }
    }
}
