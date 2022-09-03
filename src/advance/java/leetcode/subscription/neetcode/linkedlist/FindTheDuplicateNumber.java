package advance.java.leetcode.subscription.neetcode.linkedlist;

//287
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 2};
        FindTheDuplicateNumber theDuplicateNumber = new FindTheDuplicateNumber();
        System.out.println(theDuplicateNumber.findDuplicate(arr));
    }

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])-1] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        return -1;
    }
}
