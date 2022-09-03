package com.learn;

import java.util.Scanner;

public class MaxHeap {
  private static int N;

  /* Sort Function */
  public static void sort(int arr[]) {
    heapify(arr);
  }

  /* Function to build a heap */
  public static void heapify(int arr[]) {
    N = arr.length - 1;
    for (int i = N / 2; i >= 0; i--)
      maxheap(arr, i);
  }

  /* Function to swap largest element in heap */
  public static void maxheap(int arr[], int i) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int max = i;
    if (left <= N && arr[left] > arr[i])
      max = left;
    if (right <= N && arr[right] > arr[max])
      max = right;

    if (max != i) {
      swap(arr, i, max);
      maxheap(arr, max);
    }
  }

  public static void swap(int arr[], int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Heap Sort Test\n");
    int n, i;
    n = scan.nextInt();
    int arr[] = new int[n];
    for (i = 0; i < n; i++)
      arr[i] = scan.nextInt();
    sort(arr);
    for (i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}