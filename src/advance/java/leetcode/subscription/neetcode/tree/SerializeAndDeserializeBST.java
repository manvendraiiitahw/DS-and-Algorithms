package advance.java.leetcode.subscription.neetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//This solution will works if we have only unique elements in tree
public class SerializeAndDeserializeBST {
    int startNode;
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(2);
        SerializeAndDeserializeBST serializeAndDeserializeBST=new SerializeAndDeserializeBST();
        String st=serializeAndDeserializeBST.serialize(node);
        TreeNode root=serializeAndDeserializeBST.deserialize(st);
        System.out.println(root);
    }

    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        List<Integer> preOrder = new ArrayList<>();
        preorder(root, preOrder);
        List<Integer> inOrder = new ArrayList<>();
        inorder(root, inOrder);
        String pre = preOrder.stream().map(Object::toString)
                .collect(Collectors.joining(","));

        String ino = inOrder.stream().map(Object::toString)
                .collect(Collectors.joining(","));
        StringBuilder stringBuilder = new StringBuilder(pre);
        stringBuilder.append("#");
        stringBuilder.append(ino);
        return stringBuilder.toString();
    }

    void inorder(TreeNode node, List<Integer> arr) {
        if (node == null) {
            return;
        }
        inorder(node.left, arr);
        arr.add(node.val);
        inorder(node.right, arr);
    }

    void preorder(TreeNode node, List<Integer> arr) {
        if (node == null) {
            return;
        }
        arr.add(node.val);
        preorder(node.left, arr);
        preorder(node.right, arr);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()<1){
            return null;
        }
        String[] s = data.split("#");
        String[] pre = s[0].split(",");
        String[] in = s[1].split(",");
        int[]preO=new int[pre.length];
        int[]inO=new int[in.length];
        for(int i=0;i<pre.length;i++){
            preO[i]=Integer.parseInt(pre[i]);
            inO[i]=Integer.parseInt(in[i]);
        }
        return buildTree(preO, inO);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            integerIntegerMap.put(inorder[i], i);
        }
        startNode = 0;
        return buildHelper(preorder, 0, preorder.length - 1, integerIntegerMap);
    }

    public TreeNode buildHelper(int[] preorder, int start, int end, Map<Integer, Integer> integerIntegerMap) {
        if (start > end) {
            return null;
        }
        int value = preorder[startNode++];
        TreeNode root = new TreeNode(value);
        root.left = buildHelper(preorder, start, integerIntegerMap.get(value) - 1,  integerIntegerMap);
        root.right = buildHelper(preorder, integerIntegerMap.get(value) + 1, end, integerIntegerMap);
        return root;
    }

}
