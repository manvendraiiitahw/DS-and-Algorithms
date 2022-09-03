package com.learn.ds;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int status=(n & (n-1));
        if(status==0){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not a power of 2");
        }

    }
}
