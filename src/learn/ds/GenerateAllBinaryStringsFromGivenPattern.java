package learn.ds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateAllBinaryStringsFromGivenPattern {
    public static void main(String[] args) {
        String str = "1??0?101";
        Queue<String> queue = new LinkedList<>();
        queue.add(str);
        while (!queue.isEmpty()) {
            String s = queue.poll();
            int index = s.indexOf('?');
            if (index > -1) {
                char[] arr = s.toCharArray();
                arr[index] = '0';
                queue.add(String.valueOf(arr));
                arr[index] = '1';
                queue.add(String.valueOf(arr));
            }else {
                System.out.println(s);
            }
        }
    }
}
