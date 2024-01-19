/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    List<int> sol = new List<int>(); 
    public IList<int> RightSideView(TreeNode root) {
        if(root == null) {
            return sol; 
        }

        traverse(root.right, root.left); 
        return sol; 
    }
    private void traverse(TreeNode right, TreeNode left) {

        if(right == null && left == null) {
            return; 
        }
        if(right == null && left != null) { 
            sol.Add(left.val);
            return; }

        sol.Add(right.val); 
        traverse(right.right, left.left); 
    }
}
