package geeksforgeeks.mustdo;

public class TestNew1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5};
        System.out.println(TestNew1.minimumCost(arr));
//        System.out.println(TestNew.findIntern(10, 25003));
    }

    static int minimumCost(int[] arr) {
        int output = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    output++;
                    break;
                }
            }
        }
        return output;
    }


}
