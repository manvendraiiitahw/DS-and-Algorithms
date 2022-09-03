package geeksforgeeks.mustdo;

import java.util.Stack;

public class StringEncoding {
    public static void main(String[] args) {
        System.out.println(StringEncoding.collapseString("GGGGGrrrrrrrrrrrrt"));
    }

    public static String collapseString(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return inputString;
        }
        Stack<Character> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int i = 0;
        while (i < inputString.length()) {
            if (st1.isEmpty()) {
                st1.push(inputString.charAt(i));
                st2.push(1);
            } else {
                if (st1.peek() == inputString.charAt(i)) {
                    int cf = st2.pop();
                    st2.push(cf + 1);
                } else {
                    st1.push(inputString.charAt(i));
                    st2.push(1);
                }
            }
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (!st1.isEmpty()) {
            char c = st1.pop();
            int t = st2.pop();
            stringBuilder.append(c);
            StringBuilder ot= new StringBuilder();
            if(t>9){
                while (t>0){
                    ot.append(t % 10);
                    t=t/10;
                }
                stringBuilder.append(ot);

            }else{
                stringBuilder.append(t);
            }
        }
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
