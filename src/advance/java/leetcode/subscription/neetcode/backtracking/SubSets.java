package advance.java.leetcode.subscription.neetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSets {
    List<Integer> sbset = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        SubSets subSets = new SubSets();
        System.out.println(subSets.subsets(arr));
    }

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    public void dfs(int[] nums, int i) {
        if (i >= nums.length) {
            List<Integer> integers = new ArrayList<>(sbset);
            res.add(integers);
            return;
        }
        sbset.add(nums[i]);
        dfs(nums, i + 1);

        if (sbset.size() > 0) {
            sbset.remove(sbset.size() - 1);
        }
        dfs(nums, i + 1);
    }

}
