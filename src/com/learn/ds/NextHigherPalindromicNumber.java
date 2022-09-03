package com.learn.ds;

import java.util.*;

public class NextHigherPalindromicNumber {
    public static void main(String[] args) {
        NextHigherPalindromicNumber nextHigherPalindromicNumber = new NextHigherPalindromicNumber();
        System.out.println(nextHigherPalindromicNumber.nextPalin("332233"));
    }

    public String nextPalin(String N) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < N.length(); i++) {
            int i1 = Integer.parseInt(String.valueOf(N.charAt(i)));
            if (m.containsKey(i1)) m.put(i1, m.get(i1) + 1);
            else {
                m.put(i1, 1);
            }
        }
        if (m.get(Integer.parseInt(String.valueOf(N.charAt(0)))) == N.length()) {
            return "-1";
        }
        boolean allDigitAreLess = true;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getKey() > Integer.parseInt(String.valueOf(N.charAt(0)))) {
                allDigitAreLess = false;
                break;
            }
        }
        if (allDigitAreLess) {
            return "-1";

        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(m.entrySet());

        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            if (entry.getKey().equals(Integer.parseInt(String.valueOf(N.charAt(0))))) {
                break;
            }
            i++;
        }
        if (i < list.size()) {
            i++;
            while (i < list.size() && list.get(i).getValue() % 2 != 0) {
                i++;
            }
        }
        int v = list.get(i).getKey();
        list.remove(i);
        int j = 0;
        StringBuilder fh = new StringBuilder(v + "");
        StringBuilder sh = new StringBuilder(v + "");

        while (!list.isEmpty()) {
            if (j < list.size() && list.get(j).getValue() % 2 == 0) {
                fh.append(list.get(j).getKey());
//                fh.insert(0, list.get(j).getKey());
                sh.insert(0, list.get(j).getKey());
                list.remove(j);
                j = 0;
            } else {
                if (j < list.size())
                    j++;
                else
                    break;
            }
        }
        if(list.size()==1){
            fh.append(list.get(0).getKey()).append(sh);
        }
        if(list.isEmpty()){
            fh.append(sh);
        }

        System.out.println(fh.toString());
        return "";
    }
}
