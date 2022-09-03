package com.learn.leetcode;

//https://www.youtube.com/watch?v=l3hda49XcDE
public class RegularExpressionMatching {
    public static void main(String[] args){
        System.out.println(isMatch("aab", "c*a*b"));
    }


    public static boolean isMatch(String s, String p) {
//        char[] text=s.toCharArray();
//        char[] pattern=p.toCharArray();
//        boolean T[][] = new boolean[text.length + 1][pattern.length + 1];
//
//        T[0][0] = true;
//        //Deals with patterns like a* or a*b* or a*b*c*
//        for (int i = 1; i < T[0].length; i++) {
//            if (pattern[i-1] == '*') {
//                T[0][i] = T[0][i - 2];
//            }
//        }
//
//        for (int i = 1; i < T.length; i++) {
//            for (int j = 1; j < T[0].length; j++) {
//                if (pattern[j - 1] == '.' || pattern[j - 1] == text[i - 1]) {
//                    T[i][j] = T[i-1][j-1];
//                } else if (pattern[j - 1] == '*')  {
//                    T[i][j] = T[i][j - 2];
//                    if (pattern[j-2] == '.' || pattern[j - 2] == text[i - 1]) {
//                        T[i][j] = T[i][j] | T[i - 1][j];
//                    }
//                } else {
//                    T[i][j] = false;
//                }
//            }
//        }
//        return T[text.length][pattern.length];



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
