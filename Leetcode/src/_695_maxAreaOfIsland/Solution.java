package _695_maxAreaOfIsland;

import java.util.Scanner;

public class Solution {
	public static int dfs(int[][] grid, int[][] visited, int x, int y, int n, int m) {
		if(x >= n || x < 0 || y >= m || y < 0 || grid[x][y] == 0 || visited[x][y] == 1)  return 0;
		visited[x][y] = 1;
		n = grid.length;  m = grid[0].length;
		int size = 1;
		int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
		for(int i = 0; i < 4; i ++)
			size += dfs(grid, visited, x + dx[i], y + dy[i], n, m);
		return size;
	}
	public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int[][] isVisited = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i ++)
        	for(int j = 0; j < grid[0].length; j ++)
        		max = Math.max(max, dfs(grid, isVisited, i, j, grid.length, grid[0].length));
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] grid = new int[n][m];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < m; j ++)
				grid[i][j] = sc.nextInt();
		System.out.println(s.maxAreaOfIsland(grid));
	}
}
/*
8 13
0 0 1 0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 1 1 1 0 0 0
0 1 1 0 1 0 0 0 0 0 0 0 0
0 1 0 0 1 1 0 0 1 0 1 0 0
0 1 0 0 1 1 0 0 1 1 1 0 0
0 0 0 0 0 0 0 0 0 0 1 0 0
0 0 0 0 0 0 0 1 1 1 0 0 0
0 0 0 0 0 0 0 1 1 0 0 0 0

6
*/

/*
1 8
0 0 0 0 0 0 0 0

0
*/