class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        def dfs(start):
            stack = [start]
            curr_islands = 0
            while stack:
                x, y = stack.pop()
                curr_islands += 1

                # Check all neighbors and add them to visited. 

                if (x + 1) < len(grid) and grid[x+1][y] == 1:
                    pos = (x+1, y)
                    if pos not in seen:
                        stack.append(pos)
                        seen.add(pos)
                
                if (x - 1) >= 0 and grid[x-1][y] == 1:
                    pos = (x-1, y)
                    if pos not in seen:
                        stack.append(pos)
                        seen.add(pos)
                        
                if (y + 1) < len(grid[0]) and grid[x][y+1] == 1:
                    pos = (x, y +1)
                    if pos not in seen:
                        stack.append(pos)
                        seen.add(pos)
                        
                if (y - 1) >= 0 and grid[x][y-1] == 1:
                    pos = (x, y-1)
                    if pos not in seen:
                        stack.append(pos)
                        seen.add(pos)

                        
            return curr_islands

        seen = set()
        max_area = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                current = (i, j)
                if grid[i][j] == 1 and current not in seen:
                    seen.add(current)

                    # Run DFS from starting point not seen. 
                    islands = dfs(current)
                    max_area = max(islands, max_area)
        
        return max_area