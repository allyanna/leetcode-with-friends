from collections import deque


class Solution:
    def floodFill(self, image, sr: int, sc: int, color: int):
        ####
        visited = set()
        q = deque()
        current_color = image[sr][sc]
        src = (sr, sc)
        q.append(src)

        if color == current_color:
            return image
        while q:
            row, col = q.popleft()
            if (row, col) not in visited:
                if image[row][col] == current_color:
                    image[row][col] = color
                    visited.add((row, col))

                    if row + 1 < len(image) and (row+1, col) not in visited:
                        q.append((row + 1, col))
                    if row - 1 >= 0 and (row - 1, col) not in visited:
                        q.append((row - 1, col))
                    if col + 1 < len(image) and (row, col + 1) not in visited:
                        q.append((row, col + 1))
                    if col - 1 >= 0 and (row, col - 1) not in visited:
                        q.append((row, col - 1))

        return image


sol = Solution()

image = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
sr = 1
sc = 1
color = 2

solution = sol.floodFill(image, sr, sc, color)
print(solution)
