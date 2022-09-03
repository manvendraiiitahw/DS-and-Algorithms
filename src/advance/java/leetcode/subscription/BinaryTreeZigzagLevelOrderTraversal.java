package advance.java.leetcode.subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Stack<TreeNode> leftToRight = new Stack<>();
        Stack<TreeNode> rightToLeft = new Stack<>();
        rightToLeft.add(root);
        while (!leftToRight.isEmpty() || !rightToLeft.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            while (!rightToLeft.isEmpty()) {
                TreeNode node = rightToLeft.pop();
                curLevel.add(node.val);
                if (node.left != null) {
                    leftToRight.add(node.left);
                }
                if (node.right != null) {
                    leftToRight.add(node.right);
                }
            }
            if (curLevel.size() > 0) {
                output.add(curLevel);
            }
            curLevel = new ArrayList<>();
            while (!leftToRight.isEmpty()) {
                TreeNode node = leftToRight.pop();
                curLevel.add(node.val);
                if (node.right != null) {
                    rightToLeft.add(node.right);
                }
                if (node.left != null) {
                    rightToLeft.add(node.left);
                }
            }
            if (curLevel.size() > 0) {
                output.add(curLevel);
            }

        }
        return output;
    }
}
