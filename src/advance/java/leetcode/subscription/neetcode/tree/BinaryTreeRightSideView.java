package advance.java.leetcode.subscription.neetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right = new TreeNode(5);
        node.right.right = new TreeNode(6);
        node.right.left = new TreeNode(7);
        node.right.right.left = new TreeNode(4);
        BinaryTreeRightSideView treeRightSideView = new BinaryTreeRightSideView();
        System.out.println(treeRightSideView.levelOrder(node));
    }

    public List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        Queue<TreeNode> treeNodesNew = new LinkedList<>();
        treeNodes.add(root);
        List<Integer> output = new ArrayList<>();
        while (!treeNodes.isEmpty()) {
            TreeNode node = null;
            while (!treeNodes.isEmpty()) {
                node = treeNodes.poll();
                if (node.left != null) {
                    treeNodesNew.add(node.left);
                }
                if (node.right != null) {
                    treeNodesNew.add(node.right);
                }
            }
            output.add(node.val);
            node = null;
            while (!treeNodesNew.isEmpty()) {
                node = treeNodesNew.poll();
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
            }
            if (node != null) {
                output.add(node.val);
            }
        }
        return output;
    }
}
