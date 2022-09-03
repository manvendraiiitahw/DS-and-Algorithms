package advance.java.leetcode.subscription.neetcode.arrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesNumber {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
