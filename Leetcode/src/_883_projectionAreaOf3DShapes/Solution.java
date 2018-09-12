package _883_projectionAreaOf3DShapes;

import java.util.Scanner;

public class Solution {
	public int projectionArea(int[][] grid) {
		int res = 0;
		if(grid.length == 0 || grid[0].length == 0)  return 0;
		for(int i = 0; i < grid.length; i ++)
		{
			int max = 0;
			for(int j = 0; j < grid[i].length; j ++)
			{
				res += (grid[i][j] == 0) ? 0 : 1;
				max = (grid[i][j] > max) ? grid[i][j] : max;
			}
			res += max;
		}
		for(int i = 0; i < grid[0].length; i ++)
		{
			int max = 0;
			for(int j = 0; j < grid.length; j ++)
				max = (grid[j][i] > max) ? grid[j][i] : max;
			res += max;
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int N = sc.nextInt();
		int[][] grid = new int[N][N];
		
		for(int i = 0; i < N; i ++)
			for(int j = 0; j < N; j ++)
				grid[i][j] = sc.nextInt();
		System.out.println(s.projectionArea(grid));
	}

}
/*
1
2

5
*/

/*
2
1 2
3 4

17
*/

/*
2
1 0
0 2

8
*/

/*
3
1 1 1
1 0 1
1 1 1

14
*/

/*
3
2 2 2
2 1 2
2 2 2

21
*/