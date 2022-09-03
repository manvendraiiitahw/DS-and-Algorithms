package advance.java.leetcode;

class Node1
{
    int data;
    Node1 left, right;

    Node1(int item)
    {
        data = item;
        left = right = null;
    }
}
public class CousinNode {

    // Recursive function to check if two Nodes are
    // siblings
    Node1 root;
    boolean isSibling(Node1 node, Node1 a, Node1 b)
    {
        // Base case
        if (node == null)
            return false;

        return ((node.left == a && node.right == b) || (node.left == b && node.right == a) || isSibling(node.left, a, b) || isSibling(node.right, a, b));
    }

    // Recursive function to find level of Node 'ptr' in
    // a binary tree
    int level(Node1 node, Node1 ptr, int lev)
    {
        // base cases
        if (node == null)
            return 0;

        if (node == ptr)
            return lev;

        // Return level if Node is present in left subtree
        int l = level(node.left, ptr, lev + 1);
        if (l != 0)
            return l;

        // Else search in right subtree
        return level(node.right, ptr, lev + 1);
    }

    // Returns 1 if a and b are cousins, otherwise 0
    boolean isCousin(Node1 node, Node1 a, Node1 b)
    {
        // 1. The two Nodes should be on the same level
        //	 in the binary tree.
        // 2. The two Nodes should not be siblings (means
        // that they should not have the same parent
        // Node).
        return ((level(node, a, 1) == level(node, b, 1)) &&
                (!isSibling(node, a, b)));
    }

    //Driver program to test above functions
    public static void main(String args[])
    {
        CousinNode tree=new CousinNode();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.left.right.right = new Node1(15);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(7);
        tree.root.right.left.right = new Node1(8);

        Node1 Node1, Node2;
        Node1 = tree.root.left;
        Node2 = tree.root.right;
        if (tree.isCousin(tree.root, Node1, Node2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code has been contributed by Mayank Jaiswal
