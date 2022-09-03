package advance.java.leetcode.subscription.neetcode.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    class IndexAndArea {
        int index;
        int area;

        public IndexAndArea(int index, int area) {
            this.area = area;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,2,2};
        LargestRectangleInHistogram inHistogram=new LargestRectangleInHistogram();
        System.out.println(inHistogram.largestRectangleArea(arr));
    }

    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<IndexAndArea> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek().area > heights[i]) {
                IndexAndArea indexAndArea = stack.pop();
                maxArea = Math.max(maxArea, indexAndArea.area * (i - indexAndArea.index));
                start = indexAndArea.index;
            }
            stack.push(new IndexAndArea(start, heights[i]));
        }
        while (!stack.isEmpty()) {
            IndexAndArea indexAndArea = stack.pop();
            maxArea = Math.max(maxArea, indexAndArea.area * (heights.length - indexAndArea.index));
        }
        return maxArea;

    }
}
