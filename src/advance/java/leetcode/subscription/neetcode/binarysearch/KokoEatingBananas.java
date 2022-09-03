package advance.java.leetcode.subscription.neetcode.binarysearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        KokoEatingBananas eatingBananas=new KokoEatingBananas();
        System.out.println(eatingBananas.minEatingSpeed(piles,8));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            if (max < pile) {
                max = pile;
            }
        }
        int left = 0, right = max;
        int res = max;
        while (left <= right) {
            int hours = 0;
            int pivot = left + (right - left) / 2;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / pivot);
            }
            if (hours <= h) {
                right = pivot - 1;
                res = Math.min(res, pivot);
            } else {
                left = pivot + 1;
            }
        }
        return res;
    }
}
