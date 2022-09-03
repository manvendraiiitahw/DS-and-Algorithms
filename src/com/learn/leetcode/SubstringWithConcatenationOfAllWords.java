package com.learn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.geeksforgeeks.org/find-starting-indices-substrings-string-s-made-concatenating-words-listl/
//https://leetcode.com/problems/substring-with-concatenation-of-all-words/
public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        int sizeWord = words[0].length();
        int wordCount = words.length;
        int sizeL = sizeWord * wordCount;
        if (s.length() < sizeL) {
            return new ArrayList<>();
        }
        List<Integer> output = new ArrayList<>();
        Map<String, Integer> integerMap = new HashMap<>();
        for (String word : words) {
            if (integerMap.containsKey(word)) {
                integerMap.put(word, integerMap.get(word) + 1);
            } else {
                integerMap.put(word, 1);
            }
        }
        for (int i = 0; i <= (s.length() - sizeL); i++) {
            Map<String, Integer> tempMap = new HashMap<>(integerMap);
            int j = i, count = wordCount;
            while (j < (i + sizeL)) {
                String word = s.substring(j, j + sizeWord);
                if (!integerMap.containsKey(word) || (tempMap.containsKey(word) && tempMap.get(word) == 0)) {
                    break;
                } else {
                    tempMap.put(word, tempMap.get(word) - 1);
                    count--;
                }
                j = j + sizeWord;
            }
            if (count == 0) {
                output.add(i);
            }
        }
        return output;
    }
}
