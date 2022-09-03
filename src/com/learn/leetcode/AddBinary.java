package com.learn.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder stringBuilder = new StringBuilder("");
        while (i >= 0 && j >= 0) {
            int sc = Integer.parseInt(String.valueOf(a.charAt(i)));
            int sc1 = Integer.parseInt(String.valueOf(b.charAt(j)));
            if ((sc + sc1 + carry) > 1) {
                int v = (sc + sc1 + carry) % 2;
                carry = 1;
                stringBuilder.append(v);
            } else {
                stringBuilder.append((sc + sc1 + carry));
                carry = 0;
            }

            i--;
            j--;
        }
        while (i >= 0) {
            int sc = Integer.parseInt(String.valueOf(a.charAt(i)));
            if ((sc + carry) > 1) {
                int v = (sc + carry) % 2;
                carry = 1;
                stringBuilder.append(v);
            } else {
                stringBuilder.append((sc + carry));
                carry = 0;
            }
            i--;
        }
        while (j >= 0) {
            int sc = Integer.parseInt(String.valueOf(b.charAt(j)));
            if ((sc + carry) > 1) {
                int v = (sc + carry) % 2;
                carry = 1;
                stringBuilder.append(v);
            } else {
                stringBuilder.append((sc + carry));
                carry = 0;
            }
            j--;
        }
        if (carry > 0) {
            stringBuilder.append(carry);
        }


        return stringBuilder.reverse().toString();
    }
}
