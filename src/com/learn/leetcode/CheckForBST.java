package com.learn.leetcode;

import com.learn.tree.BinaryTree;

public class CheckForBST {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(2);
        binaryTree.right = new BinaryTree(7);
        binaryTree.right.right = new BinaryTree(6);
        binaryTree.right.right.right = new BinaryTree(5);
        binaryTree.right.right.right.right = new BinaryTree(9);
        binaryTree.right.right.right.right.right = new BinaryTree(2);
        binaryTree.right.right.right.right.right.right = new BinaryTree(6);
    }

    boolean checkForBst(BinaryTree tree, int min, int max) {
        return false;
    }
}
