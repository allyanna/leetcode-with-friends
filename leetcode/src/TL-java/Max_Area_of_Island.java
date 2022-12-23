package Tl;

//Link:

import java.util.Stack;

public class Max_Area_of_Island {
    public static void main(String[] args) {
//        int[][] matrix = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
//                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int[][] matrix = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};

        System.out.println(maxAreaOfIsland(matrix));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        Stack<int[]> stack = new Stack<int[]>();
        int max = 0;
        int current = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1 && !visited[i][j]) {
                    stack.push(new int[]{i, j});
                    while (!stack.isEmpty()) {
                        int[] p = stack.pop();
                        if(!visited[p[0]][p[1]]) {
                            current++;
                            visited[p[0]][p[1]] = true;

                            if (p[0] + 1 < grid.length && grid[p[0] + 1][p[1]] == 1 ) {
                                stack.push(new int[]{p[0] + 1, p[1]});
                            }
                            if (p[0] - 1 >= 0 && grid[p[0] - 1][p[1]] == 1) {
                                stack.push(new int[]{p[0] - 1, p[1]});
                            }
                            if (p[1] + 1 < grid[i].length && grid[p[0]][p[1] + 1] == 1) {
                                stack.push(new int[]{p[0], p[1] + 1});
                            }
                            if (p[1] - 1 >= 0 && grid[p[0]][p[1] - 1] == 1) {
                                stack.push(new int[]{p[0], p[1] - 1});
                            }
                        }

                    }
                    max = Math.max(max, current);
                    current = 0;
                }
                else {
                    visited[i][j] = true;
                }


            }
        }

        return max;
    }
}