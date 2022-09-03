package advance.java.leetcode.subscription.neetcode.tree;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (subRoot == null) {
            return false;
        }
        if (subTreeCheck(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean subTreeCheck(TreeNode node, TreeNode node1) {
        if (node == null && node1 == null) {
            return true;
        }
        if (node1 == null || node == null) {
            return false;
        }
        if (node.val != node1.val) {
            return false;
        }
        return subTreeCheck(node.left, node1.left) && subTreeCheck(node.right, node1.right);
    }
}
