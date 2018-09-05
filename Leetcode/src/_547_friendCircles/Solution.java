package _547_friendCircles;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static int[] uset;
	public static int find(int x)
	{
		if(uset[x] < 0)  return x;
		return find(uset[x]);
	}
	public static void unionDisjointSet(int x, int y)
	{
		if((x = find(x)) == (y = find(y)))  return ;
		if(uset[x] < uset[y])
		{
			uset[x] += uset[y];
			uset[y] = x;
		}
		else
		{
			uset[y] += uset[x];
			uset[x] = y;
		}
	}
	public int findCircleNum(int[][] M) {
		int n = M.length;
		uset = new int[n];
		for(int i = 0; i < n; i ++)  uset[i] = -1;
		for(int i = 0; i < n - 1; i ++)
			for(int j = i + 1; j < n; j ++)
			{
				if(M[i][j] == 1)
					unionDisjointSet(i, j);
			}
		Set<Integer> res = new HashSet<Integer>();
		for(int i = 0; i < n; i ++)
			res.add(find(i));
		return res.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		int[][] M = new int[n][n];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < n; j ++)
				M[i][j] = sc.nextInt();
		System.out.println(s.findCircleNum(M));
				
	}

}
