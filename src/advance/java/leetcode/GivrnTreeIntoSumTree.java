package advance.java.leetcode;

public class GivrnTreeIntoSumTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.left = new BinaryTree(-2);
        binaryTree.left.left = new BinaryTree(8);
        binaryTree.left.right = new BinaryTree(-4);
        binaryTree.right = new BinaryTree(-6);
        binaryTree.right.left = new BinaryTree(5);
        binaryTree.right.right = new BinaryTree(7);
        convertIntoSumTree(binaryTree);
        printBtree(binaryTree);
    }

    static int convertIntoSumTree(BinaryTree root) {
        if (root == null) return 0;
        int oldVal = root.val;

        root.val = convertIntoSumTree(root.left)
                + convertIntoSumTree(root.right);
        return root.val + oldVal;

    }

    static void printBtree(BinaryTree root) {
        if (root == null) {
            return;
        }
        printBtree(root.left);
        System.out.print(root.val + " ");
        printBtree(root.right);
    }


}
