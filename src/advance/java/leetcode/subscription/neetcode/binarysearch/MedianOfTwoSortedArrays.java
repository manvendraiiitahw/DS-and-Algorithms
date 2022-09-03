package advance.java.leetcode.subscription.neetcode.binarysearch;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean flag = nums1.length > nums2.length;
        int[] temp;
        if (!flag) {
            temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        int total = nums1.length + nums2.length;
        int half = Math.floorDiv(total,2);
        int l = 0, r = nums2.length - 1;
        while (true) {
            int i = Math.floorDiv(l + r,2); //For num2
            int j = half - i - 2; //for num1, As indexing is starting from 0
            int ALeft = i >= 0 ? nums2[i] : Integer.MIN_VALUE;
            int ARight = (i + 1) < nums2.length ? nums2[i + 1] : Integer.MAX_VALUE;
            int BLeft = j >= 0 ? nums1[j] : Integer.MIN_VALUE;
            int BRight = (j + 1) < nums1.length ? nums1[j + 1] : Integer.MAX_VALUE;
            if (ALeft <= BRight && BLeft <= ARight) {
                if (total % 2 == 1) {
                    return Math.min(ARight, BRight);
                } else {
                    return (double) (Math.max(ALeft, BLeft) + Math.min(ARight, BRight)) / 2;
                }
            } else if (ALeft > BRight) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
    }
}
