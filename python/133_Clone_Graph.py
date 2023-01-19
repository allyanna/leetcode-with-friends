"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""


class Solution:
    def cloneGraph(self, node: 'Node') -> 'Node':
        '''
        Actual problem solution
        https://leetcode.com/problems/clone-graph/solutions/1792858/python3-iterative-bfs-beats-98-explained/
        
         '''
        if not node:
            return None

        # Save the nodes in a hashmap for later access.
        visited = {node.val: Node(node.val, [])}

        # Use DFS, but BFS would work as well. Just
        # need to change it from a stack to a q
        stack = [node]

        while stack:
            curr = stack.pop()
            curr_copy = visited[curr.val]
            for n in curr.neighbors:
                # DFS through the original list
                if n.val not in visited:

                    stack.append(n)
                    visited[n.val] = Node(n.val, [])

                curr_copy.neighbors.append(visited[n.val])


        return visited[node.val]
