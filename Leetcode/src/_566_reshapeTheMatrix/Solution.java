package _566_reshapeTheMatrix;

import java.util.Scanner;

public class Solution {
	public static int[][] matrixReshape(int[][] nums, int r, int c)
	{
		if(r * c != nums.length * nums[0].length)  return nums;
		int[][] res = new int[r][c];
		for(int i = 0; i < r; i ++)
			for(int j = 0; j < c; j ++)
				res[i][j] = nums[(i * c + j) / nums[0].length][(i * c + j) % nums[0].length];
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[][]{{1, 2}, {3, 4}};
		System.out.println(nums.length + " " + nums[0].length);
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();
		int[][] res = matrixReshape(nums, r, c);
		for(int i = 0; i < r; i ++)
		{
			for(int j = 0; j < c; j ++)
				System.out.print(res[i][j] + " ");
			System.out.println("");
		}
	}

}
