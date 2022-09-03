package advance.java.gudiya;

import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int output=arr[0];
        for(int i=1;i<N;i++){
            output=output^arr[i];
        }
        System.out.println(output);
    }
}
