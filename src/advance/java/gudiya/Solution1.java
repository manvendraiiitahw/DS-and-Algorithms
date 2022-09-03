package advance.java.gudiya;

import java.util.Arrays;

public class Solution1 {
    public int solution(int[] arr, int m) {
        boolean[] status = new boolean[arr.length];
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((Math.abs(arr[i] - arr[j])) % m == 0 && !status[i] && !status[j] && j-i==1) {
                    res = res + 2;
                    status[i] = true;
                    status[j] = true;
                    break;
                }
            }
        }
        if(res==0){
            Arrays.sort(arr);
            for(int i=arr.length-1;i>=0;i--){
                if (arr[i] % m == 0) {
                    res++;
                    break;
                }
            }
        }
        return res;

    }

//}

    public static void main(String[] args) {
        Solution1 s = new Solution1();
//        int[] arr = {-3, -2, 1, 0, 8, 7, 1};
//        int m = 3;
//        System.out.println(s.solution(arr, m));
        int[] arr = {7,1,11,8,4,10,16};
        int m = 8;
        System.out.println(s.solution(arr, m));

//        System.out.println(s.solution("Codility We test coders", 14));
//        System.out.println(s.solution("Why Not", 100));
//        System.out.println(s.solution("The quick brown fox jumps over the lazy dog", 39));
//        System.out.println(s.solution("to crop or not to crop", 21));
    }
}
