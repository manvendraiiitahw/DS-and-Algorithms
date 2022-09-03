package advance.java.leetcode;

public class RepeatedElementInSortedArray {
    static int findRepeatingElement(int arr[], int low, int high)
    {
        // low = 0 , high = n-1;
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        // Check if the mid element is the repeating one
        if (arr[mid] != mid + 1)
        {
            if (mid > 0 && arr[mid]==arr[mid-1])
                return mid;

            // If mid element is not at its position that means
            // the repeated element is in left
            return  findRepeatingElement(arr, low, mid-1);
        }

        // If mid is at proper position then repeated one is in
        // right.
        return findRepeatingElement(arr, mid+1, high);
    }

    // Driver method
    public static void main(String[] args)
    {
        int  arr[] = {1, 2, 3, 3, 4, 5};
        int index = findRepeatingElement(arr, 0, arr.length-1);
        if (index != -1)
            System.out.println(arr[index]);
    }
}
