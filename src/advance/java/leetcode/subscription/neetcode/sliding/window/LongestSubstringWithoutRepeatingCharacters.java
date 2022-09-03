package advance.java.leetcode.subscription.neetcode.sliding.window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters characters=new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(characters.lengthOfLongestSubstring(" "));
    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch=new HashSet<>();
        int output=0, start=0;
        for(int i=0;i<s.length();i++){
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
            }else{
                if(i-start > output){
                    output=(i-start);
                }
                while(ch.contains(s.charAt(i))){
                    ch.remove(s.charAt(start));
                    start++;
                }
                ch.add(s.charAt(i));
            }
        }
        return Math.max(s.length()-start, output);
    }
}
