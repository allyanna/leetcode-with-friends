# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        if not root:
            return None

        # A q for bfs. Level order traversal is what we want. 
        q = collections.deque()
        q.append(root)

        while q:
            curr_size = len(q)
            # Iterate over root, invert and q the children
            # If None, we don't care.
            for i in range(curr_size):
                curr = q.popleft()
                temp = curr.left
                curr.left = curr.right
                curr.right = temp

                if curr.left:
                    q.append(curr.left)
                if curr.right:
                    q.append(curr.right)

        return root