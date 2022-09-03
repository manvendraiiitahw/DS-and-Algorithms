package advance.java.leetcode.subscription.neetcode.arrayAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] input = {""};
        List<List<String>> output=groupAnagrams.groupAnagrams(input);
        System.out.println(output);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> listMap = new HashMap<>();
        for (String str : strs) {
            String temp = str;
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            temp = String.valueOf(ch);
            if (listMap.containsKey(temp)) {
                List<String> ls = listMap.get(temp);
                ls.add(str);
                listMap.put(temp, ls);
            } else {
                List<String> ls=new ArrayList<>();
                ls.add(str);
                listMap.put(temp, ls);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }
}
