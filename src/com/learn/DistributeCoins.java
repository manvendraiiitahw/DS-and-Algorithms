package com.learn;

import java.util.Scanner;

public class DistributeCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int i = 1;
            while (sum(i) <= n){
                i++;
            }
            System.out.println(i-1);
            t--;
        }
    }
    static int sum(int j){
        return (j*(j+1))/2;
    }
}
