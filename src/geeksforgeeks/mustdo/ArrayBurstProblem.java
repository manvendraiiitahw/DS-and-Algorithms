package geeksforgeeks.mustdo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayBurstProblem {

    public static void main(String[] args) {
//        bcdeeeeddcbfgf
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("c");
        input.add("d");
        input.add("e");
        input.add("e");
        input.add("e");
        input.add("e");
        input.add("d");
        input.add("d");
        input.add("c");
        input.add("b");
        input.add("f");
        input.add("g");
        input.add("f");
        input.add("d");
        input.add("c");
        System.out.println(ArrayBurstProblem.getShrunkArray(input, 3));
    }




    /*
     * Complete the 'getShrunkArray' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY inputArray
     *  2. INTEGER burstLength
     */

    static class FrequencyMap {
        String str;
        int count;

        public FrequencyMap(String str, int count) {
            this.str = str;
            this.count = count;
        }
    }

    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
        List<String> output = new ArrayList<>();
        Stack<FrequencyMap> st = new Stack<>();
        for(int i=0; i<inputArray.size(); i++) {
            String s = inputArray.get(i);
            if(st.isEmpty()) {
                st.push(new FrequencyMap(s, 1));
            }
            else if (st.peek().str.equals(s)) {
                int count = st.peek().count;
                st.pop();
                st.push(new FrequencyMap(s, count+1));
            }
            else {
                int count = st.peek().count;
                if(count>=burstLength) {
                    st.pop();
                    i--;
                }
                else {
                    st.push(new FrequencyMap(s, 1));
                }
            }
        }

        if(!st.isEmpty() && st.peek().count >= burstLength) {
            st.pop();
        }

        while(!st.isEmpty()) {
            int count = st.peek().count;
            String s = st.peek().str;
            while(count-->0) {
                output.add(0, s);

            }
            st.pop();
        }

        return output;


//        if (inputArray == null || inputArray.size() == 0) {
//            return null;
//        }
//        List<String> output = new ArrayList<>();
//        Stack<String> st1 = new Stack<>();
//        Stack<Integer> st2 = new Stack<>();
//        for (int i = 0; i < inputArray.size(); i++) {
//            String str = inputArray.get(i);
//            if (st1.isEmpty()) {
//                st1.push(str);
//                st2.push(1);
//            } else {
//                if (st1.peek().equals(str)) {
//                    int cf = st2.pop();
//                    st2.push(cf + 1);
//                } else if (st2.peek() >= burstLength) {
//                    st1.pop();
//                    st2.pop();
//                }
//                if (st1.peek().equals(str)) {
//                    int cf = st2.pop();
//                    st2.push(cf + 1);
//                } else {
//                    st1.push(str);
//                    st2.push(1);
//                }
//            }
//        }
//        if (!st1.isEmpty() && st2.peek() >= burstLength) {
//            st1.pop();
//            st2.pop();
//        }
//
//
//        while (!st1.isEmpty()) {
//            StringBuilder stringBuilder = new StringBuilder("");
//            String c = st1.pop();
//            int t = st2.pop();
//            while (t > 0) {
//                stringBuilder.append(c);
//                t--;
//            }
//            stringBuilder.reverse();
//            output.add(0,stringBuilder.toString());
//        }
////        stringBuilder.reverse();
////        output.add(stringBuilder.toString());
//
//
//        return output;
    }
}
