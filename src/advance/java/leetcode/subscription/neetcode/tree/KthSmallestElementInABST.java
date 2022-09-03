package advance.java.leetcode.subscription.neetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//leetocode:230
public class KthSmallestElementInABST {
    int num = -1;

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(2);
        node.right.left.left = new TreeNode(4);
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        System.out.println(kthSmallestElementInABST.kthSmallest(node, 3));
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> treeNodes = new Stack<>();
        while (true) {
            while (root != null) {
                treeNodes.add(root);
                root = root.left;
            }
            root = treeNodes.pop();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;

        }
    }

    void inOrder(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inOrder(node.left, k);
        k--;
        if (k == 0) {
            num = node.val;
        }
        inOrder(node.right, k);
    }
}
