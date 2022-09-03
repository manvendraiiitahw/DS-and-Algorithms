package advance.java.leetcode.subscription.neetcode.tree;

public class DiameterOfBinaryTree {
    int diameter = 0;

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(1);
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        diameterOfBinaryTree.diameterOfBinaryTree(node);
        System.out.println(diameterOfBinaryTree.diameter);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = diameterOfBinaryTree(root.left);
        int rh = diameterOfBinaryTree(root.right);
        diameter = Math.max(diameter, (lh + rh));
        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTreeNew(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = diameterOfBinaryTreeNew(root.left);
        int rh = diameterOfBinaryTreeNew(root.right);
        int lw = diameterOfBinaryTreeNew(root.left);
        int rw = diameterOfBinaryTreeNew(root.right);

        return Math.max(lh + rh + 1, Math.max(lw, rw));

    }
}
