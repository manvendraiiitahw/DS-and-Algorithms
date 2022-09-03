package advance.java.leetcode;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] arr = {3,5,3, 4};
        int k = 5;
        BoatsToSavePeople boatsToSavePeople = new BoatsToSavePeople();
        System.out.println(boatsToSavePeople.numRescueBoats(arr, k));
    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0, end = people.length - 1;
        int output = 0;

        while (start < end) {
            if (people[end] + people[start] <= limit) {
                start++;
                end--;
                output++;
            } else if (people[end] + people[start] > limit) {
                end--;
                output++;
                if (start == end) {
                    start++;
                    output++;
                }
            }
        }
        if (start == end) {
            output++;
        }
        return output;
    }
}
