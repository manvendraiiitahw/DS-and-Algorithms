package com.learn.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str={"iflow", "flower","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        else if(strs.length==1){
            return strs[0];
        }else{
            int curPref=Integer.MAX_VALUE, k;
            for (int i=1;i<strs.length;i++){
                k=0;
                for (int j=0;j< strs[i].length();j++){
                    if(strs[0].length()> k &&strs[0].charAt(k)==strs[i].charAt(j)){
                        k++;
                    }else {
                        break;
                    }
                }
                if(k ==0){
                    return "";
                }
                else if(curPref > k){
                    curPref=k;
                }
            }
            return strs[0].substring(0,curPref);
        }
    }
}
