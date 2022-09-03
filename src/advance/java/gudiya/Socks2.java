package advance.java.gudiya;

import java.util.Scanner;

public class Socks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        Socks2 socks2=new Socks2();
        socks2.solution(s);

    }

    public void solution(String S) {
        if (S.length() < 7) {
            System.out.println("NO");
        }
        int curLen = 0;
        boolean stutus=false;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '1') {
                curLen++;
                if (curLen == 7) {
                    System.out.println("YES");
                    stutus=true;
                    break;
                }
            }
            if (S.charAt(i) == '0') {
                curLen = 0;
            }
        }
        if(!stutus){
            System.out.println("NO");
        }
    }
}
