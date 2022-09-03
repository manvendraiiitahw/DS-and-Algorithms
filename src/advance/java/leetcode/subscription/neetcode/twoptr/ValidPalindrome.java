package advance.java.leetcode.subscription.neetcode.twoptr;

//leetcode:125
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]", "");
        if(s.length()==1){
            return true;
        }
        s=s.toLowerCase();
        int i=0, n=s.length()-1;
        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}
