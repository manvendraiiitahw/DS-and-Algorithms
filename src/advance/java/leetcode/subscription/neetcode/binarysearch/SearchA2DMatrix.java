package advance.java.leetcode.subscription.neetcode.binarysearch;

//leetcode:74
public class SearchA2DMatrix {

    public static void main(String[] args) {
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchA2DMatrix.searchMatrix(input, 31));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            boolean status = search(ints, target);
            if (status) {
                return true;
            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return true;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return false;
    }
}
