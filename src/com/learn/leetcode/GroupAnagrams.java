package com.learn.leetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {""};
        GroupAnagrams groupAnagrams=new GroupAnagrams();
        System.out.println(groupAnagrams.findGroupAnagram(strs));
    }

    public List<List<String>> findGroupAnagram(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String st : str) {
            char[] ar = st.toCharArray();
            Arrays.sort(ar);

            if (map.containsKey(String.valueOf(ar))) {
                List<String> ls = map.get(String.valueOf(ar));
                ls.add(st);
                map.put(String.valueOf(ar), ls);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(st);
                map.put(String.valueOf(ar), ls);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (Map.Entry e : map.entrySet()) {
            output.add((List<String>) e.getValue());
        }
        return output;
    }
}
