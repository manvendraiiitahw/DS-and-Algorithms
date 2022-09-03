package com.learn;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startRange = sc.nextInt();
        int endRange = sc.nextInt();
        int i = startRange;
        while (Math.pow(i, 6) <= endRange) {
            int sixSquare = (int) Math.pow(i, 6);
            int square = (int) Math.sqrt(sixSquare);
            int cube = (int) Math.pow(i, 3);
            if (cube == square) {
                System.out.println(sixSquare);
            }
            i++;
        }
    }
}
