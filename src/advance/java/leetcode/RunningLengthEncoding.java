package advance.java.leetcode;

import java.util.Stack;

public class RunningLengthEncoding {
    public static void main(String[] args) {
        System.out.println(encode("aaaabbbcccd"));
    }

    static String encode(String str) {
        if (str.length() < 1) {
            return str;
        }
        Stack<Character> characters = new Stack<>();
        int cnt = 1;
        characters.push(str.charAt(0));
        int i = 1;
        while (i < str.length()) {
            if (characters.peek() == str.charAt(i)) {
                cnt++;
            } else {
                StringBuilder builder = new StringBuilder("");
                if (cnt > 9) {
                    while (cnt > 9) {
                        int t = cnt % 10;
                        builder.append(t);
                        cnt = cnt / 10;
                    }
                    builder.reverse();
                    int j = 0;
                    while (j < builder.length()) {
                        characters.add(builder.charAt(j));
                    }
                } else {
                    characters.add(String.valueOf(cnt).charAt(0));
                }
                characters.add(str.charAt(i));
                cnt = 1;
            }
            i++;
        }
        characters.add(String.valueOf(cnt).charAt(0));
        StringBuilder builder = new StringBuilder("");
        while (!characters.isEmpty()) {
            builder.append(characters.peek());
            characters.pop();
        }
        builder.reverse();
        return builder.toString();
    }
}
