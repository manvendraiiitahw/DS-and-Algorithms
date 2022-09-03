package advance.java.leetcode.subscription.backtrack;

public class KthSymbolInGrammar {
    public static void main(String[] args) {
        KthSymbolInGrammar symbol = new KthSymbolInGrammar();
        System.out.println(symbol.kthGrammar(30, 20));
    }

    public int kthGrammar(int n, int k) {
        String s = "0";
        s = kthGrammarHelper(n, s);
        if (k > s.length()) {
            return -1;
        } else {
            return Integer.parseInt(s.charAt(k - 1) + "");
        }
    }

    public String kthGrammarHelper(int n, String s) {
        if (n == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append("01");
            } else {
                sb.append("10");
            }
        }
        s = sb.toString();
        return kthGrammarHelper(n - 1, s);
    }
}
