//package datastructure.learning;
//
//public class BinaryTreeIntoDDL {
//    static LinkedList<S> head=null;
//    static LinkedList<S> NewHead=null;
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree(1);
//        binaryTree.left = new BinaryTree(2);
//        binaryTree.left.left = new BinaryTree(3);
//        binaryTree.left.right = new BinaryTree(4);
//        binaryTree.right = new BinaryTree(5);
//        binaryTree.right.left = new BinaryTree(6);
//        binaryTree.right.right = new BinaryTree(7);
//        convertBinaryTreeIntoDDL(binaryTree);
//        System.out.println(NewHead);
//        while (NewHead!=null){
//            System.out.println(NewHead.data);
//            NewHead=NewHead.next;
//        }
//    }
//
//    static void convertBinaryTreeIntoDDL(BinaryTree root) {
//        if (root == null) {
//            return;
//        }
//        convertBinaryTreeIntoDDL(root.left);
//        if (head == null) {
//            head = new LinkedList<S>(root.data);
//            NewHead=head;
//        } else {
//            LinkedList<S> temp = new LinkedList<S>(root.data);
//            head.next = temp;
//            temp.prev = head;
//            head = temp;
//        }
//        convertBinaryTreeIntoDDL(root.right);
//    }
//}
