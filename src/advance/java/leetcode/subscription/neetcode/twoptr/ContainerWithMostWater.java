package advance.java.leetcode.subscription.neetcode.twoptr;

//leetcode:11
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1;
        int max=Integer.MIN_VALUE;
        while(start<end){
            int min=Math.min(height[start],height[end]);
            int curMax=min*(end-start);
            if(max<curMax){
                max=curMax;
            }
            if(height[start]<height[end]){
                start++;
            }else if(height[start]==height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
