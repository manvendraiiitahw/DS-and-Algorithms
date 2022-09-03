package com.learn.tree;

import advance.java.leetcode.subscription.neetcode.tree.TreeNode;

public class BalancedBinaryTree {
    private boolean balanced;

    public boolean isBalanced(TreeNode root) {
        balanced = true;
        balanceCheck(root);
        return balanced;
    }

    private int balanceCheck(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = balanceCheck(root.left);
        int rh = balanceCheck(root.right);
        balanced = balanced & (Math.abs(lh - rh) > 1 ? false : true);
        return Math.max(lh, rh) + 1;
    }
}
