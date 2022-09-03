package coding.dcp;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/20/19
 */

public class PrintMatrixCloseWise {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

    int k = 0;
    int row = arr[0].length;
    int col = arr.length;
    while (k < arr[0].length) {
      for (int i = k; i < row; i++) {
        System.out.println(arr[k][i]);
      }
      k++;
      for (int j = k; j < col; j++) {
        System.out.println(arr[j][row-k]);
      }

//      k++;
    }

  }
}
