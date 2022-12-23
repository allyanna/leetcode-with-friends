package Tl;

public class Maximum_Depth_of_Binary_Tree {

    /**
     * Definition for a binary tree node.**/
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


    public static void main(String[] args) {
          //Input for maximum Depth
          //[3,9,20,null,null,15,7]
          //maxDepth()
    }

    public static int maxDepth(TreeNode root) {

        return recursion(root);
    }

    public static int recursion(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = recursion(root.left);
        int right = recursion(root.right);

        return Math.max(left, right) + 1;

    }
}
