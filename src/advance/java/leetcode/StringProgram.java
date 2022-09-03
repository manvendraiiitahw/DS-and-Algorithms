package advance.java.leetcode;// { Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StringProgram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new SolutionNew().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class SolutionNew {
    String removeDuplicates(String str) {
        // code here
        StringBuilder sb=new StringBuilder();
        Set<Character> ch=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!ch.contains(str.charAt(i))){
                ch.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

