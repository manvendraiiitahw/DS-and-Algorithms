package advance.java.leetcode.subscription.backtrack;

public class MaximumDepthOfBTree {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        treeNode.right.left=new TreeNode(4);
        treeNode.right.right=new TreeNode(5);
        MaximumDepthOfBTree maximumDepthOfBTree=new MaximumDepthOfBTree();
        System.out.println(maximumDepthOfBTree.maxDepth(treeNode));
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
          if(lh>rh){
            return 1+lh;
        }else{
            return 1+rh;
        }
    }

    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=1+height(root.left);
        int rh=1+height(root.right);
        if(lh>rh){
            return lh;
        }else{
            return rh;
        }
    }
}
