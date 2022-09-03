package advance.java.leetcode.subscription.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {
    public static void main(String[] args) {
        List<Integer> output=getRow(1);
        output.forEach(System.out::println);
//        for (Integer i: output)
    }

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }
        List<Integer> newList = getRow(rowIndex - 1);
        List<Integer> output = new ArrayList<>();
        output.add(1);
        for (int i = 0; i < newList.size(); i++) {
            if (i == newList.size() - 1) {
                output.add(1);
            } else {
                output.add(newList.get(i) + newList.get(i + 1));
            }
        }
        return output;

    }
}
