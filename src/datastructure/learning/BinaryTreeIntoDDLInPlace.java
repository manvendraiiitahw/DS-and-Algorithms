package datastructure.learning;

public class BinaryTreeIntoDDLInPlace {
    //    static LinkedList head=null;
//    static LinkedList NewHead=null;
    static BinaryTree temp;
    static BinaryTree head;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.left = new BinaryTree(2);
        binaryTree.left.left = new BinaryTree(3);
        binaryTree.left.right = new BinaryTree(4);
        binaryTree.right = new BinaryTree(5);
        binaryTree.right.left = new BinaryTree(6);
        binaryTree.right.right = new BinaryTree(7);
        convertBinaryTreeIntoDDL(binaryTree);
        print(head);
    }

    static void print(BinaryTree head) {
       while (head!=null) {
           System.out.println(head.data);
           head = head.right;
       }
    }

    static void convertBinaryTreeIntoDDL(BinaryTree root) {
        if (root == null) {
            return;
        }
        convertBinaryTreeIntoDDL(root.left);
        if (temp == null) {
            head = root;
        } else {
            root.left = temp;
            temp.right = root;
        }
        temp = root;
        convertBinaryTreeIntoDDL(root.right);
    }
}
