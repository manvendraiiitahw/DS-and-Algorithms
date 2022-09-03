package coding.dcp.ms;

import java.util.Scanner;

public class DesignATinyURL {
    public static void main(String[] args) {
        String ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder stringBuilder = new StringBuilder("");
            int num = n;
            while (n > 0) {
                int rem = n % 62;
                stringBuilder.append(ch.charAt(rem));
                n = n / 62;
            }
            System.out.println(stringBuilder.reverse().toString());
            System.out.println(num);
        }


    }
}
