package _463_islandPerimeter;

import java.util.Scanner;
public class Solution {
	public int islandPerimeter(int[][] grid) {
		int res = 0;
		for(int i = 0; i < grid.length; i ++)
			for(int j = 0; j < grid[0].length; j ++)
				if(grid[i][j] == 1) {
					res += 4;
					if(i > 0 && grid[i - 1][j] == 1)  res --;
					if(j > 0 && grid[i][j - 1] == 1)  res --;
					if(i < grid.length - 1 && grid[i + 1][j] == 1)  res --;
					if(j < grid[0].length - 1 && grid[i][j + 1] == 1)  res --;
				}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] map = new int[n][m];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < m; j ++)
				map[i][j] = sc.nextInt();
		System.out.println(s.islandPerimeter(map));
	}
}
/*
4 4
0 1 0 0
1 1 1 0
0 1 0 0
1 1 0 0

16
*/