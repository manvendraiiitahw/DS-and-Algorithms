package coding.dcp.ms;

public class MinMovesObtainStringWithoutThreeIdenticalConsecutiveLetters {
    public static void main(String[] args) {
        System.out.println(minMoves("baabaa"));
    }

    static int minMoves(String s) {
        int conLetters = 1, output = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                conLetters++;
            } else if (s.charAt(i) != s.charAt(i + 1) && conLetters < 3) {
                conLetters = 1;
            } else if (conLetters == 3) {
                output++;
                conLetters = 1;
            }
            if (conLetters == 4) {
                output++;
                conLetters = 1;
            }
            if (i == s.length() - 2 && conLetters == 3) {
                output++;
            }

        }
        return output;
    }
}
