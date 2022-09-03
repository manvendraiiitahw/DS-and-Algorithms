package advance.java.leetcode.subscription.neetcode.twoptr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode:15
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> output=new ArrayList<>();

        for(int i=0;i < nums.length && nums[i]<=0;i++){

            if(i==0 || nums[i-1]!=nums[i]){
                int start=i+1, end=nums.length-1;
                while(start < end){
                    int sum=nums[i]+nums[start]+nums[end];
                    if(sum==0){
                        List<Integer> out=new ArrayList<>();
                        out.add(nums[i]);
                        out.add(nums[start]);
                        out.add(nums[end]);
                        output.add(out);
                        start++;
                        end--;
                        while(start< end && nums[start]==nums[start-1]){
                            start++;
                        }
                    }
                    else if(sum<0){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return output;
    }
}
