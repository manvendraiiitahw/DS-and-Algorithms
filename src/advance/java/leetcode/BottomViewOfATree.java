package advance.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class BottomViewOfATree {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(5);
        root.left = new BinaryTree(3);
        root.left.left = new BinaryTree(1);
        root.left.left.left = new BinaryTree(0);
        root.left.right = new BinaryTree(4);
        root.right = new BinaryTree(7);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(9);
        root.right.right.left = new BinaryTree(8);
        printBottomView(root);
    }

    static void printBottomView(BinaryTree binaryTree) {
        Map<Integer, Integer> map = new HashMap<>();
        printBottomViewOfTree(binaryTree, 0, map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + ",");
        }
    }

    static void printBottomViewOfTree(BinaryTree root, int level, Map<Integer, Integer> view) {
        if (root == null) {
            return;
        }
        view.put(level, root.val);
        printBottomViewOfTree(root.left, level - 1, view);
        printBottomViewOfTree(root.right, level + 1, view);
    }
}
