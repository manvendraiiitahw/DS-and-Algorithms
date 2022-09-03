package geeksforgeeks.mustdo;

import java.util.ArrayList;

//Given a number N, generate bit patterns from 0 to 2^N-1 such that successive patterns differ by one bit.
public class GrayCode {
    public static void main(String[] args) {
        System.out.println(GrayCode.graycode(3));
    }

    public static ArrayList<String> graycode(int n) {
        //code here
        ArrayList<String> output = new ArrayList<>();
        generateGrayCode(n, output, "");
        return output;
    }

    public static void generateGrayCode(int n, ArrayList<String> strings, String s) {
        for (int i = 0; i < n; i++) {
            if (s.length() == n) {
                strings.add(s);
                return;
            }
            generateGrayCode(n, strings, s.concat("0"));
            generateGrayCode(n, strings, s.concat("1"));
        }
    }
}
