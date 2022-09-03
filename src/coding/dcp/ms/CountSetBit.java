package coding.dcp.ms;

public class CountSetBit {
    public static void main(String[] args) {
        int n = 256;
        int l = 0;
        while (n >= Math.pow(2, l)) {
            l++;
        }
        int i = 1, count = 0;
        while (i <= l) {
            if ((n & (1 << (i - 1))) != 0) {
                count++;
            }
            i++;
        }
        System.out.println(count);

    }
}
