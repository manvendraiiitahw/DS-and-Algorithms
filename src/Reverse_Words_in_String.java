public class Reverse_Words_in_String {

  static String reverse(String str, int low, int high) {
    char s[] = str.toCharArray();
    while (low < high) {
      char temp = s[low];
      s[low] = s[high];
      s[high]=temp;
      low++;
      high--;
    }
    return String.valueOf(s);
  }

  static String reverseWordsInString(String str) {
    int len = str.length();
    int i = 0;
    int start = 0;
    while (i < len) {
      if (str.charAt(i) == ' ') {
        str = reverse(str, start, i-1);
        start = i + 1;
      }
      i++;
      // System.out.println("i="+i+" len="+len+" String="+str);
    }
    str = reverse(str, start, len - 1);
    str = reverse(str, 0, len - 1);

    return str;
  }

  public static void main(String args[]) {
    String str = "I am from India";
    System.out.println(reverseWordsInString(str));

  }

}
