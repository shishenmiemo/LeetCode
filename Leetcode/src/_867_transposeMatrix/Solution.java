package _867_transposeMatrix;

import java.util.Scanner;

public class Solution {
	public int[][] transpose(int[][] A) {
		int[][] res = new int[A[0].length][A.length];
		for(int i = 0; i < A.length; i ++)
			for(int j = 0; j < A[0].length; j ++)
				res[j][i] = A[i][j];
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] A = new int[n][m];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < m; j ++)
				A[i][j] = sc.nextInt();
		int[][] ans = s.transpose(A);
		for(int i = 0; i < ans.length; i ++)
			for(int j = 0; j < ans[i].length; j ++)
				System.out.println(ans[i][j]);
	}

}
/*
3 3
1 2 3 4 5 6 7 8 9

1 4 7 2 5 8 3 6 9
*/

/*
2 3
1 2 3 4 5 6

1 4 2 5 3 6
*/