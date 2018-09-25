package _892_surfaceAreaOf3DShapes;

import java.util.Scanner;

public class Solution {
	public int surfaceArea(int[][] grid) {
		int res = 0;
		for(int i = 0; i < grid.length; i ++)
			for(int j = 0; j < grid[i].length; j ++)
			{
				res += grid[i][j] * 4 + (grid[i][j] == 0 ? 0 : 2);
				if(i > 0)  res -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
				if(j > 0)  res -= Math.min(grid[i][j], grid[i][j - 1]) * 2; 
			}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		int[][] grid = new int[n][n];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < n; j ++)
				grid[i][j] = sc.nextInt();
		System.out.println(s.surfaceArea(grid));
	}
}
/*
1
2

10
*/

/*
2
1 2
3 4

34
*/

/*
2
1 0
0 2

16
*/

/*
3
1 1 1
1 0 1
1 1 1

32
*/

/*
3
2 2 2
2 1 2
2 2 2

46
*/