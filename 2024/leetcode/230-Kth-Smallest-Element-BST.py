class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        res = []
        def inorder(node):
            if not node: return
            inorder(node.left)
            if len(res) == k:
                return
            res.append(node.val)
            inorder(node.right)
        inorder(root)
        return res[-1]
