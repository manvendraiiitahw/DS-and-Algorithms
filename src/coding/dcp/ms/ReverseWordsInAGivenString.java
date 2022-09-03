package coding.dcp.ms;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        System.out.println(reverseWord("i.like.this.program.very.much"));
        System.out.println(reverseWord("pqr.mno"));
    }

    static String reverseWord(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                reverse(arr, start, i-1);
                start = i + 1;
            }
            i++;
        }
        reverse(arr, start, i - 1);
        reverse(arr, 0, i - 1);
        return String.valueOf(arr);


//        StringBuilder stringBuilder = new StringBuilder("");
//        StringBuilder output = new StringBuilder("");
//        int i = 0;
//        while (i < s.length()) {
//            if (s.charAt(i) != '.') {
//                stringBuilder.append(s.charAt(i));
//            } else {
//                stringBuilder.reverse();
//                stringBuilder.append(s.charAt(i));
//                output.append(stringBuilder);
//                stringBuilder = new StringBuilder("");
//            }
//            i++;
//        }
//        stringBuilder.reverse();
//        output.append(stringBuilder);
//        output.reverse();
//        return output.toString();
    }

    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;
        }

    }
}
