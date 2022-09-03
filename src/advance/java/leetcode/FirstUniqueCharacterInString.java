package advance.java.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                q.remove(s.charAt(i));
            }else{
                mp.put(s.charAt(i),i);
                q.add(s.charAt(i));
            }
        }
        return q.isEmpty()?-1:mp.get(q.peek());

    }
}
