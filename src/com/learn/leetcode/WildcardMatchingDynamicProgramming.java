package com.learn.leetcode;

public class WildcardMatchingDynamicProgramming {
    public static void main(String[] args) {
        String s1 = "mis*is*p*.";
        String s2 = "mississippi";
        System.out.println(wildcardMatching(s2, s1));
    }

    static boolean wildcardMatching(String s, String p) {
        char[] text=s.toCharArray();
        char[] patt=p.toCharArray();
        boolean[][]dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;

        for (int i=1;i<dp[0].length;i++){
            if(patt[i-1]=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        for (int i=1;i< dp.length;i++){
            for (int j=1;j < dp[0].length;j++){
                if(patt[j-1]=='.' || patt[j-1]==text[i-1]){
                    dp[i][j]=dp[i-1][j-1];
                }else if(patt[j-1]=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(patt[j-2]=='.' || patt[j-2]==text[i-1]){
                        dp[i][j]=dp[i][j] | dp[i-1][j];
                    }
                }else {
                    dp[i][j]=false;
                }
            }
        }


        return dp[text.length][patt.length];
    }

}
