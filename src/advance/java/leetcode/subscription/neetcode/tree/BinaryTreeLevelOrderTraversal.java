package advance.java.leetcode.subscription.neetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right = new TreeNode(5);
        node.right.right = new TreeNode(6);
        node.right.left = new TreeNode(7);
        node.right.right.left = new TreeNode(4);
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        System.out.println(binaryTreeLevelOrderTraversal.levelOrder(node));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        Queue<TreeNode> treeNodesNew = new LinkedList<>();
        treeNodes.add(root);
        List<List<Integer>> output = new ArrayList<>();
        while (!treeNodes.isEmpty()) {
            List<Integer> integers = new ArrayList<>();
            while (!treeNodes.isEmpty()) {
                TreeNode node = treeNodes.poll();
                integers.add(node.val);
                if (node.left != null) {
                    treeNodesNew.add(node.left);
                }
                if (node.right != null) {
                    treeNodesNew.add(node.right);
                }
            }
            if(integers.size()>0) {
                output.add(integers);
            }
            integers = new ArrayList<>();
            while (!treeNodesNew.isEmpty()) {
                TreeNode node = treeNodesNew.poll();
                integers.add(node.val);
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
            }
            if(integers.size()>0) {
                output.add(integers);
            }
        }
        return output;

    }
}
