package geeksforgeeks.mustdo;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {0, 2, 6, 8, 9};
        MergeWithoutExtraSpace.merge(arr1,arr2,4,5);
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int i=0,j=0;
        while (i<n && j<m){
            if(arr1[i]<=arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                long temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i++;
                Arrays.sort(arr2);
            }
        }
        System.out.println(arr1);
        System.out.println(arr2);
    }
}
