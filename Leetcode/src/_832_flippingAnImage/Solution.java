package _832_flippingAnImage;

import java.util.Scanner;

public class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		if(A.length == 0)  return A;
        int[][] res = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i ++)
        	for(int j = 0; j < A[0].length; j ++)
	        	res[i][j] = 1 - A[i][A[0].length - j - 1];
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
		int[][] ans = s.flipAndInvertImage(A);
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j ++)
				System.out.print(ans[i][j] + " ");
			System.out.println("");
		}			
	}
}
/*
3 3
1 1 0
1 0 1
0 0 0

1 0 0
0 1 0
1 1 1
*/

/*
4 4
1 1 0 0
1 0 0 1
0 1 1 1
1 0 1 0

1 1 0 0
0 1 1 0
0 0 0 1
1 0 1 0
*/

