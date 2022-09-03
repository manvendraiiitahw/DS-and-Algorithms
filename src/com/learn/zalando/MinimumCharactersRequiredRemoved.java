package com.learn.zalando;// Java program to implement
// the above approach

import java.util.*;

public class MinimumCharactersRequiredRemoved {
    static int minCntCharDeletionsFrequency(String S) {
        HashMap<Character,
                Integer> frequencyMap =
                new HashMap<>();

        PriorityQueue<Integer> integerPriorityQueue =
                new PriorityQueue<>((x, y) ->
                        Integer.compare(y, x));
        int charCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (frequencyMap.containsKey(S.charAt(i))) {
                frequencyMap.put(S.charAt(i),
                        frequencyMap.get(S.charAt(i)) + 1);
            } else {
                frequencyMap.put(S.charAt(i), 1);
            }
        }
        for (Map.Entry<Character,
                Integer> entry :
                frequencyMap.entrySet()) {
            integerPriorityQueue.add(entry.getValue());
        }
        while (!integerPriorityQueue.isEmpty()) {
            int frequent = integerPriorityQueue.peek();
            integerPriorityQueue.remove();
            if (integerPriorityQueue.isEmpty()) {
                return charCount;
            }
            if (frequent == integerPriorityQueue.peek()) {
                if (frequent > 1) {
                    integerPriorityQueue.add(frequent - 1);
                }
                charCount++;
            }
        }
        return charCount;
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "aaaabbbb";

// Stores length of str
        int N = str.length();
        System.out.print(minCntCharDeletionsFrequency(str));
    }
}

// This code is contributed by Rajput-Ji
