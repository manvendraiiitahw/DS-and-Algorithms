package com.learn;

public class MaxOfEveryWindowSizeK {

  static void printKMax(int arr[], int n, int k)
  {
    int[] LR=new int[arr.length];
    int[] RL=new int[arr.length];
    int l=1;
    int lrMax=arr[0];
    LR[0]=arr[0];
    for(int i=1;i<n;i++){
      if(i%k==0) {
        LR[i] = arr[i];
      }
      else
        LR[i]=Math.max(LR[i-1], arr[i]);
      }

    for(int i=n-1;i>=0;i--){
      if(i%k==0) {
        RL[i] = arr[i];
      }
      else
        RL[i]=Math.max(RL[i+1], arr[i]);
    }

      System.out.println(RL);
    }

  public static void main(String[] args){
    int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
    int k = 3;
    printKMax(arr, arr.length, k);

  }

}
