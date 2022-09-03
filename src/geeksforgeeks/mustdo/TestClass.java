package geeksforgeeks.mustdo;

import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 6, 7, 8,2};
//        System.out.println(TestNew.minimumCost(arr));
//        System.out.println(TestNew.findIntern(10, 25003));

        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            TestClass testClass = new TestClass();
            System.out.println(testClass.minimumCost(arr,0));
        }
    }
     int minimumCost(int[] arr, int output) {

        boolean flag = true;
        int n = arr.length;
        int i = 0;
        while (true) {
            if (arraySortedOrNot(arr, i, n)) {
                return output;
            } else {
                output++;
                if (n >1 && flag && arr[n-1]< arr[n-2]) {
                    n--;
                    flag = false;
                } else {
                    i++;
                    flag = true;
                }
            }

        }
    }

     boolean arraySortedOrNot(int a[], int start, int n) {
        if (n == start + 1 || n == start)
            return true;
        return a[n - 1] >= a[n - 2]
                && arraySortedOrNot(a, start, n - 1);
    }



}
