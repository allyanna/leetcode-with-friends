class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:

        ROWS, COLS = len(heights), len(heights[0])
        pac, atl = set(), set()

        def dfs (coords, prev_h, visited):
            r,c = coords

            # If we've not visited, not within range, 
            # or less than the previous height, we don't care.
            if (r,c) in visited or r < 0 or c < 0 or r == ROWS or c == COLS or heights[r][c] < prev_h:
                return
            
            visited.add((r,c))

            dfs((r+1, c), heights[r][c], visited)
            dfs((r-1, c), heights[r][c], visited)
            dfs((r, c+1), heights[r][c], visited)
            dfs((r, c - 1), heights[r][c], visited)

        # Iterate over the columns that are borderline with pacific and atlantic
        for c in range(COLS):
            dfs((0, c), heights[0][c], pac)
            dfs((ROWS-1, c), heights[ROWS-1][c], atl)
            
        # Iterate over the rows that are borderline with pacific and atlantic
        for r in range(ROWS):
            dfs((r, 0), heights[r][0], pac)
            dfs((r, COLS-1), heights[r][COLS-1], atl)

        res = []

        # Check that both exist inside the two sets
        for i in range(ROWS):
            for j in range(COLS):
                if(i, j) in pac and (i,j) in atl:
                    res.append([i, j])
        
        return res