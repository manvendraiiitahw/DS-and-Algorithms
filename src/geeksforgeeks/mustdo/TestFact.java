package geeksforgeeks.mustdo;

public class TestFact {
    public static void main(String[] args) {
        System.out.println(TestFact.findIntern(10, 25003));
    }

    static int findIntern(int n, int p) {
        int start = 5000;
        if(p==start){
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            if (5000 * i == p) {
                return i;
            }
            boolean status = find(5000 * i, p, 1);
            if (status) {
                return i;
            }
        }
        return -1;
    }

    static boolean find(int start, int p, int i) {
        if (start < p) {
            start = start + 5000 + i;
            i++;
            return find(start, p, i);
        } else return start == p;
    }
}
