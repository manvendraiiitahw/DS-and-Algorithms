package com.learn.hashmap;

import java.util.*;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        System.setProperty("java.rmi.server.hostname","192.168.1.2");
        String[] words = {"act", "god", "cat", "dog", "tac" };
        PrintAnagramsTogether together = new PrintAnagramsTogether();
        List<List<String>> out = together.Anagrams(words);
        System.out.println(out);
        System.out.println(System.getProperty("java.rmi.server.hostname"));

    }

    public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : string_list) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String ns = Arrays.toString(ch);
            if (mp.containsKey(ns)) {
                List<String> lst = mp.get(ns);
                lst.add(s);
                mp.put(ns, lst);
            } else {
                mp.put(ns, new ArrayList<>(Collections.singleton(s)));
            }
        }
        for (Map.Entry<String,List<String>> entry: mp.entrySet()){
            if(entry.getValue().size()>1){
                output.add(entry.getValue());
            }
        }
        return output;
    }
}
