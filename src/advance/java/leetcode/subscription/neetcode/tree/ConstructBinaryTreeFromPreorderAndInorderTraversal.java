package advance.java.leetcode.subscription.neetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    Map<Integer, Integer> integerIntegerMap = new HashMap<>();
    int startNode;

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        ConstructBinaryTreeFromPreorderAndInorderTraversal treeFromPreorderAndInorderTraversal = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        TreeNode node = treeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        treeFromPreorderAndInorderTraversal.print(node);
    }

    void print(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        print(node.left);
        print(node.right);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            integerIntegerMap.put(inorder[i], i);
        }
        startNode = 0;
        return buildHelper(preorder, 0, preorder.length - 1);
    }

    public TreeNode buildHelper(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int value = preorder[startNode++];
        TreeNode root = new TreeNode(value);
        root.left = buildHelper(preorder, start, integerIntegerMap.get(value) - 1);
        root.right = buildHelper(preorder, integerIntegerMap.get(value) + 1, end);
        return root;
    }
}
