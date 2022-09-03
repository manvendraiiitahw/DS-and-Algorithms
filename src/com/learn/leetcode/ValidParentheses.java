package com.learn.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        System.out.println(isValid("{}{}{{()}}{"));
    }
    public static boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        Stack<Character> st=new Stack<>();
        int i=1;
        st.push(s.charAt(0));
        while (i<s.length()){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                st.push(s.charAt(i));
                i++;
            }
            else if(!st.isEmpty() && ((s.charAt(i)=='}' && st.peek()=='{') || (s.charAt(i)==']' && st.peek()=='[') || (s.charAt(i)==')' && st.peek()=='('))){
                st.pop();
                i++;
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
