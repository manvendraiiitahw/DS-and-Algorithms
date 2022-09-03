package advance.java.leetcode;

public class BinaryTreeLevel {
    int data;
    BinaryTreeLevel left;
    BinaryTreeLevel right;
    BinaryTreeLevel nextRight;

    public BinaryTreeLevel(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.nextRight = null;
    }
}
