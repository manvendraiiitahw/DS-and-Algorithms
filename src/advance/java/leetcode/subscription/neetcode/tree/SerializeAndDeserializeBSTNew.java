package advance.java.leetcode.subscription.neetcode.tree;

import java.util.*;
import java.util.stream.Collectors;


//This solution will works both the cases like duplicate elements or unique elements in tree
public class SerializeAndDeserializeBSTNew {
    int startNode;

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        SerializeAndDeserializeBSTNew serializeAndDeserializeBST = new SerializeAndDeserializeBSTNew();
        String st = serializeAndDeserializeBST.serialize(node);
        TreeNode root = serializeAndDeserializeBST.deserialize(st);
        System.out.println(root);
    }

    public String serialize(TreeNode root) {
        String str = "";
        return reSerialize(root, str);
    }

    public String reSerialize(TreeNode root, String str) {
        if (root == null) {
            str = str + "null,";
        } else {
            str = str + root.val + ",";
            str = reSerialize(root.left, str);
            str = reSerialize(root.right, str);
        }
        return str;
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strings = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        return reDeserialize(list);
    }

    public TreeNode reDeserialize(List<String> list) {
        if (Objects.equals(list.get(0), "null")) {
            list.remove(0);
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        node.left = reDeserialize(list);
        node.right = reDeserialize(list);

        return node;
    }

}
