package advance.java.leetcode;

public class GenerateAFiniteButAnArbitrarilyLargeBinaryTreeQuickly {
    public static void main(String[] args) {
        BinaryTree root = generate();
        System.out.println(root);
        printBtree(root);
    }

    static void printBtree(BinaryTree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        printBtree(root.left);
        printBtree(root.right);
    }

    public static BinaryTree generate() {
        BinaryTree root = new BinaryTree(0);
        if (Math.random() < 0.5) {
            root.left = generate();
        }
        if (Math.random() < 0.5) {
            root.right = generate();
        }
        return root;
    }
}
