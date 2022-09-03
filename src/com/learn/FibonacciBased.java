package com.learn;

import java.math.BigInteger;

public class FibonacciBased {
    public static void main(String[] args){
        int n=10;

        BigInteger[] arr=new  BigInteger[n+1];
        arr[1]=BigInteger.valueOf(0);
        arr[2]=BigInteger.valueOf(1);
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1].add((arr[i-2].multiply(BigInteger.valueOf(2)))).add(BigInteger.valueOf(3));
            System.out.println(arr[i]);
        }
        System.out.println(arr[n].intValue());

    }
}
