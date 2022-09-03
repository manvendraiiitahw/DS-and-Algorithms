public class StringMatching {
    public static void main(String[] args) {
        String str = "hwqwhharSasendra";
        String test=str.toLowerCase();
        String str2 = "hharsas";
        String test2=str2.toLowerCase();
        System.out.println(test.contains(test));
        System.out.println(str.regionMatches(false, 3, str2, 3, 4));
    }
}
