package advance.java.leetcode;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class TestinfCodality {
    public static void main(String[] args) {
        String st="ACBDACBD";
        if(Objects.nonNull(st)) {
            String newString = st.replaceAll("AB|BA|CD|DC", "");
            while (!st.equals(newString)) {
                st = newString;
                newString = newString.replaceAll("AB|BA|CD|DC", "");
            }
        }
        System.out.println(st);
    }
}
