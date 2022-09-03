package advance.java.gudiya;

import java.util.Scanner;

public class Socks1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]j={192, 442, 692, 942};
        while (t-- >0){

            int n=sc.nextInt();
            int i=n/4;
            StringBuilder stringBuilder=new StringBuilder("");
            if(n-i*4 == 0) {
                int a=i-1;
                int b=j[n-i*4-1];
                if(a!=0) {
                    stringBuilder.append(a);
                }
                stringBuilder.append(b);
                System.out.println(stringBuilder);
            }
            else {
                int b=j[n-i*4-1];
                if(i!=0) {
                    stringBuilder.append(i);
                }
                stringBuilder.append(b);
                System.out.println(stringBuilder);
            }
        }
    }
}
