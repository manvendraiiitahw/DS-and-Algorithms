package advance.java.leetcode;
//
//An n-bit gray code sequence is a sequence of 2n integers where:
//
//        Every integer is in the inclusive range [0, 2n - 1],
//        The first integer is 0,
//        An integer appears no more than once in the sequence,
//        The binary representation of every pair of adjacent integers differs by exactly one bit, and
//        The binary representation of the first and last integers differs by exactly one bit.
//        Given an integer n, return any valid n-bit gray code sequence.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrayCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> integers = generateGrayCode1(n);
            for (Integer i : integers) {
                System.out.println(i);
            }
        }
    }

    public static List<Integer> generateGrayCode1(int n) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < (Math.pow(2, n)); i++) {

            int val = (i ^ (i >> 1));
            output.add(val);
        }
        return output;
    }

    public List<Integer> generateGrayCodes(int n) {
        List<Integer> output = new ArrayList<>();
        if (n == 1) {
            output.add(0);
            output.add(1);
            return output;
        }
        List<String> L1 = new ArrayList<>();
        L1.add("0");
        L1.add("1");
        List<String> L2 = new ArrayList<>();
        L2.add("1");
        L2.add("0");
        while (n > 1) {
            for (int i = 0; i < L1.size(); i++) {
                String s = L1.get(0);
                s = "0" + s;
                L1.add(i, s);
            }
            for (int i = 0; i < L2.size(); i++) {
                String s = L2.get(0);
                s = "1" + s;
                L2.add(i, s);
            }
            L1.addAll(L2);
            n--;
        }

        return output;

    }
}
