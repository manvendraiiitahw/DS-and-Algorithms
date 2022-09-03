package advance.java.leetcode.subscription;

public class ReverseStringUsingRec {
    public static void main(String[] args) {
        ReverseStringUsingRec stringUsingRec = new ReverseStringUsingRec();
        String s = "hell";
        char[] c = s.toCharArray();
        stringUsingRec.printString(c, 0);
        System.out.println(c);
    }

    public void printString(char[] s, int i) {
        if (i < s.length / 2) {
            printString(s, i + 1);
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        } else {
            return;
        }
    }
}
