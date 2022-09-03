package advance.java.leetcode.subscription.neetcode.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

//652
public class FindDuplicateSubtrees {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(2);
        node.right.left.left = new TreeNode(4);
        FindDuplicateSubtrees findDuplicateSubtrees = new FindDuplicateSubtrees();
        List<TreeNode> treeNodes = findDuplicateSubtrees.findDuplicateSubtrees(node);
        System.out.println(treeNodes);
    }

    Set<String> visited = new HashSet<>();
    Map<String, TreeNode> res = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        postOrder(root);
        return new LinkedList<>(res.values());
    }

    public String postOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder("");
        String leftNode = "NT", rightNode = "NT";
        if (root.left != null) {
            leftNode = postOrder(root.left);
        }
        if (root.right != null) {
            rightNode = postOrder(root.right);
        }
        sb.append(root.val);
        sb.append(",");
        sb.append(leftNode);
        sb.append(",");
        sb.append(rightNode);
        String curSubtree = sb.toString();
        saveDuplicateSubtree(root, curSubtree);
        visited.add(curSubtree);
        return curSubtree;
    }

    private void saveDuplicateSubtree(TreeNode node, String key) {
        if (visited.contains(key)) {
            res.put(key, node);
        }
    }
}
