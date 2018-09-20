package _766_toeplitzMatrix;

import java.util.Scanner;

public class Solution {
	public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i ++)
        	for(int j = 0; j < matrix[0].length - 1; j ++)
        		if(matrix[i][j] != matrix[i + 1][j + 1])  return false;
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] mat = new int[n][m];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < m; j ++)
				mat[i][j] = sc.nextInt();
		System.out.println(s.isToeplitzMatrix(mat));
	}
}
/*
3 4
1 2 3 4
5 1 2 3
9 5 1 2

True
*/

/*
2 2
1 2
2 2

False
*/