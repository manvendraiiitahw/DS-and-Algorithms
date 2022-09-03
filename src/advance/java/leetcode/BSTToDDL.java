package advance.java.leetcode;

public class BSTToDDL {
    static BinaryTree head = null;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(5);
        tree.left = new BinaryTree(3);
        tree.right = new BinaryTree(6);
        tree.left.right = new BinaryTree(4);
        tree.left.left = new BinaryTree(1);
        tree.right.right = new BinaryTree(8);
        tree.left.left.right = new BinaryTree(2);
        tree.left.left.left = new BinaryTree(0);
        tree.right.right.left = new BinaryTree(7);
        tree.right.right.right = new BinaryTree(9);
        convertToDdl(tree);
        print(head);
    }

    static void convertToDdl(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return;
        }
        convertToDdl(binaryTree.right);
        binaryTree.right = head;
        if (head != null) {
            head.left = binaryTree;
        }
        head = binaryTree;
        convertToDdl(binaryTree.left);
    }

    static void print(BinaryTree binaryTree) {
        while (binaryTree != null) {
            System.out.print(binaryTree.val + " ");
            binaryTree = binaryTree.right;
        }
    }
}
