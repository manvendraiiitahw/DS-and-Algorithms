package advance.java.leetcode.subscription.backtrack;

public class CheckBST {
    public static void main(String[] args) {
//        [-2147483648,null,2147483647]
        TreeNode treeNode = new TreeNode(-2147483648);
        treeNode.right = new TreeNode(2147483647);
        CheckBST bst = new CheckBST();
        System.out.println(bst.isValidBST(treeNode));
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        } else {
            return isValid(root, null,null);
        }
    }

    public static boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min!=null && root.val <= min || max!=null && root.val >= max) {
            return false;
        }
        return (isValid(root.left, min, root.val) && isValid(root.right, root.val, max));
    }
}
