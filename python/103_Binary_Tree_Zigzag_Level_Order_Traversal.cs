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
    public IList<IList<int>> ZigzagLevelOrder(TreeNode root) {

        var values = new List<IList<int>>(); 
        Queue<TreeNode> q = new Queue<TreeNode>(); 
        bool isLeft = true; 

        if(root != null)
            q.Enqueue(root);


        while(q.Count > 0){

            var list = new List<int>(); 
            int len = q.Count; 

            for(int i = 0; i < len; i ++)
            {
                TreeNode n = q.Dequeue(); 
                list.Add(n.val); 

                if (n.left != null)
                {
                    q.Enqueue(n.left); 
                }

                if(n.right != null)
                {
                    q.Enqueue(n.right);
                }
            }
            if(isLeft) {
                values.Add(list); 
            }
            else {
                list.Reverse(); 
                values.Add(list);
            }
            isLeft = !isLeft;
        } 
        return values;
    }
}