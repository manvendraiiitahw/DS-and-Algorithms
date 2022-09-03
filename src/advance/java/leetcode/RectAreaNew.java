package advance.java.leetcode;//Java program to find maximum rectangular area in linear time

import java.util.Stack;

public class RectAreaNew {
    // The main function to find the maximum rectangular area under given
    // histogram with n bars
    static int getMaxArea(int hist[], int n) {
        Stack<Integer> s = new Stack<>();
        int max_area = 0; // Initialize max area
        int tp; // To store top of stack
        int area_with_top; // To store area with top bar as the smallest bar
        int i = 0;
        while (i < n) {
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
            else {
                tp=s.pop(); // pop the top
                area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
        while (!s.empty()) {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;

    }

    // Driver program to test above function
    public static void main(String[] args) {
//		int hist[] = { 6, 2, 5, 6, 7, 1, 6 };
        int hist[] = {4, 0, 0, 3, 0};
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
        char[][] matr={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matr));
    }

	public static int maximalRectangle(char[][] matrix) {

		int[] temp=new int[matrix[0].length];
		int maxArea=0;
        for (char[] chars : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (chars[j] == '1') {
                    temp[j] = temp[j] + 1;
                } else {
                    temp[j] = 0;
                }
            }
            int getCurMaxArea = getMaxArea(temp, matrix[0].length);
            if (getCurMaxArea > maxArea) {
                maxArea = getCurMaxArea;
            }
        }
		return maxArea;

	}


}
//This code is Contributed by Sumit Ghosh
