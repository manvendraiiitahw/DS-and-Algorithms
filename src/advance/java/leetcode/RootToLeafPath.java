package advance.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.left = new BinaryTree(2);
        binaryTree.left.left = new BinaryTree(4);
        binaryTree.left.right = new BinaryTree(5);
        binaryTree.right = new BinaryTree(6);
        binaryTree.right.left = new BinaryTree(7);
        binaryTree.right.right = new BinaryTree(8);
        binaryTree.left.left.left = new BinaryTree(10);
        List<BinaryTree> binaryTrees = new ArrayList<>();
        int pathLen = 0;
        findPath(binaryTree, binaryTrees, pathLen);

    }

    public static void findPath(BinaryTree binaryTree, List<BinaryTree> path, int pathLen) {
        if (binaryTree == null) {
            return;
        }
        path.add(pathLen, binaryTree);
        pathLen++;
        if (binaryTree.left == null && binaryTree.right == null) {
            printPath(path, pathLen);
        }
        findPath(binaryTree.left, path, pathLen);
        findPath(binaryTree.right, path, pathLen);
    }

    public static void printPath(List<BinaryTree> binaryTrees, int pathLen) {
        for (int i = 0; i < pathLen; i++) {
            System.out.print(binaryTrees.get(i).val + " ");
        }
        System.out.println();
    }
}
