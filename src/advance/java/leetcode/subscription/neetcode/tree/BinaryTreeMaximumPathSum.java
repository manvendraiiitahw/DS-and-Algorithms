package advance.java.leetcode.subscription.neetcode.tree;

import java.util.ArrayList;
import java.util.List;

//leetcode: 124
public class BinaryTreeMaximumPathSum {
    static int val=0;
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(-10);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        val=node.val;
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        System.out.println(binaryTreeMaximumPathSum.maxPathSum(node));
    }

    int maxpathSumInTree(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=maxpathSumInTree(node.left);
        int right=maxpathSumInTree(node.right);
        left=Math.max(left,0);
        right=Math.max(right,0);
        val=Math.max(val, node.val+left+right);
        return node.val+Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        print(root);
        int maxSum = 0, maxSumSoFar = 0;
        for (Integer integer : list) {
            maxSumSoFar = maxSumSoFar + integer;
            if (maxSumSoFar > maxSum) {
                maxSum = maxSumSoFar;
            }
            if (maxSumSoFar < 0) {
                maxSumSoFar = 0;
            }
        }
        return maxSum;
    }

    void print(TreeNode node) {
        if (node == null) {
            return;
        }
        print(node.left);
        list.add(node.val);
        print(node.right);
    }

    int max_sum = Integer.MIN_VALUE;

    public int max_gain(TreeNode node) {
        if (node == null) return 0;

        // max sum on the left and right sub-trees of node
        int left_gain = Math.max(max_gain(node.left), 0);
        int right_gain = Math.max(max_gain(node.right), 0);

        // the price to start a new path where `node` is a highest node
        int price_newpath = node.val + left_gain + right_gain;

        // update max_sum if it's better to start a new path
        max_sum = Math.max(max_sum, price_newpath);

        // for recursion :
        // return the max gain if continue the same path
        return node.val + Math.max(left_gain, right_gain);
    }

    public int maxPathSum1(TreeNode root) {
        max_gain(root);
        return max_sum;
    }




}
