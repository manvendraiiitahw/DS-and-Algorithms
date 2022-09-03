package advance.java.leetcode.subscription;

public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(6));
    }

    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        if(n>1){
            sb.append("1");
        }
        while (n-- > 2) {
            int cnt = 1;
            int i = 0;
            StringBuilder stringBuilder = new StringBuilder("");
            while (i < sb.length() - 1) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    cnt++;
                } else {
                    stringBuilder.append(cnt).append(sb.charAt(i));
                    cnt=1;
                }
                i++;
            }
            stringBuilder.append(cnt).append(sb.charAt(i));
            sb = stringBuilder;
        }
        return sb.toString();
    }
}
