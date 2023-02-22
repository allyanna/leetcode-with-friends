IList<IList<int>> LevelOrder(TreeNode root)
{

    var solution = new List<IList<int>>();
    Queue<TreeNode> q = new();

    q.Enqueue(root);

    while (q.Count > 0)
    {

        int currLen = q.Count;
        List<int> values = new List<int>();
        while (currLen > 0)
        {
            TreeNode node = q.Dequeue();

            values.Add(node.val);
            if (node.left != null)
            {
                q.Enqueue(node.left);
            }
            if (node.right != null)
            {
                q.Enqueue(node.right);
            }
            currLen--;
        }
        solution.Add(values);
    }
    return solution;
}