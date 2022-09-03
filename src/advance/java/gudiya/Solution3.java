package advance.java.gudiya;


import java.util.Iterator;
import java.util.LinkedList;

public class Solution3 {

    private static int hack;
    public Solution3(){
        hack++;
    }
    protected static int getHack(){
        return hack;
    }

    public static int solution(int[] A) {
        int count = 0;
        int nSum = 0;
        int pSum = 0;
        int j = 0, nStart = 0;
        boolean status = false;
        while (j < A.length) {
            if (A[j] < 0) {
                nSum = nSum + A[j];
                if (!status) {
                    nStart = j;
                    status = true;
                }
            } else {
                pSum = pSum + A[j];
            }
            while ((pSum - Math.abs(nSum)) < 0) {
                nSum = nSum - A[nStart];
                nStart++;
                count++;
            }
            j++;
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args) {
        Solution3 s1=new Solution3();
        Solution3 s2=new Solution3();
        Solution3 s3=new Solution3();
        Solution3 s4=new Solution3();
        Solution3 s5=new Solution3();
        Solution3 s6=new Solution3();
//        s6.
        System.out.println(getHack());
//        int[] a = {5, -2, -3, 1};
//        int n = a.length;
//
//        System.out.println(solution(a));

        Integer hack[]=new Integer[1];
        hack[0]=null;
        System.out.println(hack.length);

        LinkedList<String> l=new LinkedList<String>();
        l.add("Alice");
        l.add("Bob");
        l.add(2,"Mikw");
        l.add("Lisa");
        Iterator<String> it=l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}