package advance.java.leetcode.subscription.neetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        EncodeAndDecodeStrings strings=new EncodeAndDecodeStrings();
        List<String> list= new ArrayList<>();
        list.add("");
        list.add("");
        String s=strings.encode(list);
        List<String> out=strings.decode(s);
        System.out.println(out);
    }
    public String encode(List<String> strs) {
        String d = Character.toString((char)257);
        return String.join(d, strs);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String d = Character.toString((char)257);
        return Arrays.asList(s.split(d,-1));
    }
//public String encode(List<String> strs) {
//    if (strs.size() == 0) return Character.toString((char)258);
//
//    String d = Character.toString((char)257);
//    StringBuilder sb = new StringBuilder();
//    for(String s: strs) {
//        sb.append(s);
//        sb.append(d);
//    }
//    sb.deleteCharAt(sb.length() - 1);
//    return sb.toString();
//}
//
//    // Decodes a single string to a list of strings.
//    public List<String> decode(String s) {
//        String d = Character.toString((char)258);
//        if (s.equals(d)) return new ArrayList();
//
//        d = Character.toString((char)257);
//        return Arrays.asList(s.split(d, -1));
//    }
}
