package coding.dcp.ms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 15, 50, 40, 30, 45, 60, 9, 8};
        merge(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void merge(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            merge(arr, l, m);
            merge(arr, m + 1, r);
            mergeSort(arr, l, m, r);
        }
    }

    static void mergeSort(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] Left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            Left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (Left[i] <= right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
