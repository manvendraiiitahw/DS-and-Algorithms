package geeksforgeeks.mustdo;

import java.util.HashSet;
import java.util.Set;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        System.out.println(LongestPrefixSuffix.lps("ababababababab"));
    }
    static int lps(String s) {

        if(s.length()==0 || s.length()==1){
            return 0;
        }
        int count=0;
        Set<String> set=new HashSet<>();
        for (int i=1;i<s.length();i++){
            set.add(s.substring(0,i));
        }
        int curMax=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(set.contains(s.substring(i))){
                curMax=s.length()-i;
                count= Math.max(curMax, count);
            }
        }
        return count;
    }
}
