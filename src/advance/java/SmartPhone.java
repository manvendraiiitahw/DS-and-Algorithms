package advance.java;

import java.util.Scanner;

public class SmartPhone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int[] price=new int[n];
            for(int i=0;i<n;i++){
                price[i]=sc.nextInt();
            }
            int[] qualities=new int[n];
            for(int i=0;i<n;i++){
                qualities[i]=sc.nextInt();
            }
            boolean found=false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(price[i]> price[j] && qualities[i]<qualities[j] || price[i] < price[j] && qualities[i]>qualities[j]){
                        System.out.println("Yes");
                        found=true;
                        break;
                    }
                }
                if(found){
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
        }
    }
}
