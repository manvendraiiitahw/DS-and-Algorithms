package advance.java;

import java.util.Scanner;

public class CharacterCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
        System.out.println(cal("abcd","abab"));
    }

    static String cal(String X, String Y){
        char[] x1=X.toCharArray();
        char[] y1=Y.toCharArray();
        int i=0;
        StringBuilder sc=new StringBuilder("");
        while(i< x1.length){
            int a=x1[i]%'a' + y1[i]%'a';
            char ch= (char) (a+'a');
           sc.append(ch);
            i++;
        }
      return sc.toString();
    }
}
