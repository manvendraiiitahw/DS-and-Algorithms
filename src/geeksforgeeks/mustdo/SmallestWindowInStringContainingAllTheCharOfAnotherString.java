package geeksforgeeks.mustdo;

public class SmallestWindowInStringContainingAllTheCharOfAnotherString {
    public static void main(String[] args) {
        System.out.println(SmallestWindowInStringContainingAllTheCharOfAnotherString.findSmallestWindow("toc","timetopractice"));
    }

    public static String findSmallestWindow(String pat, String str) {
        if (str.length() < pat.length()) {
            return "-1";
        }
        int[] hashPat = new int[256];
        for (int i = 0; i < pat.length(); i++)
            hashPat[pat.charAt(i)]++;
        int start = 0, startIndex = -1, windowLen = Integer.MAX_VALUE;
        int cnt = 0;
        int[] hashStr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hashStr[str.charAt(i)]++;

            if (hashStr[str.charAt(i)] <= hashPat[str.charAt(i)]) {
                cnt++;
            }
            if (cnt == pat.length()) {
                while (hashStr[str.charAt(start)] > hashPat[str.charAt(start)] || hashPat[str.charAt(start)] == 0) {
                    if (hashStr[str.charAt(start)] > hashPat[str.charAt(start)]) {
                        hashStr[str.charAt(start)]--;
                        start++;
                    }
                }
                int curWind = i - start + 1;
                if (windowLen > curWind) {
                    windowLen = curWind;
                    startIndex = start;
                }


            }

        }
        if (startIndex == -1) {
            return "-1";
        }
        return str.substring(startIndex, startIndex + windowLen);
    }
}
