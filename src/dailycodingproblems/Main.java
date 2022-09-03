package dailycodingproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            StringBuilder result = new StringBuilder();
            String[] str = line.split(",");
            if (str.length < 2) {
                System.out.println("Please pass input in correct format, ex: 0000,0000");
                continue;
            }
            String a = str[0];
            String b = str[1];
            if (!isBinaryNumber(a) || !isBinaryNumber(b)) {
                System.out.println("Please pass input in binary format only, ex: 0000,0000");
                continue;
            }

            int s = 0;
            int i = a.length() - 1, j = b.length() - 1;
            while (i >= 0 || j >= 0 || s == 1) {
                s += ((i >= 0) ? a.charAt(i) - '0' : 0);
                s += ((j >= 0) ? b.charAt(j) - '0' : 0);
                result.insert(0, (char) (s % 2 + '0'));
                s /= 2;
                i--;
                j--;
            }
            result = new StringBuilder(removeLeadingZero(result.toString()));
            System.out.println(result);
        }
    }

    private static String removeLeadingZero(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        if (i == str.length()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, i, "");
        return sb.toString();
    }

    public static boolean isBinaryNumber(String num) {
        for (int i = 0; i < num.length(); i++) {
            int a;
            try {
                a = Integer.parseInt(num.charAt(i) + "");
            } catch (Exception e) {
                return false;
            }
            if (a > 1) {
                return false;
            }
        }
        return true;
    }

    //  public static String removeZero(String str)
//    {
//        int i = str.length()-1;
//        while (i > 0 && str.charAt(i) == '0') {
//            i--;
//        }
//        return str.substring(0, i+1);
//    }
}
