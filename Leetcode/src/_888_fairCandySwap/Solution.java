package _888_fairCandySwap;

import java.util.*;

public class Solution {
	public int[] fairCandySwap(int[] A, int[] B) {
		int sumA = 0, sumB = 0;
		Set<Integer> setA = new HashSet<>();
		for(int i = 0; i < A.length; i ++) {
			sumA += A[i];  setA.add(A[i]);
		}
		for(int i = 0; i < B.length; i ++)  sumB += B[i];
		int diff = (sumA - sumB) / 2;
		for(int i = 0; i < B.length; i ++)
			if(setA.contains(diff + B[i]))
				return new int[]{diff + B[i], B[i]};
		return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strsA = sc.nextLine().split(" "), strsB = sc.nextLine().split(" ");
		int[] numsA = new int[strsA.length], numsB = new int[strsB.length];
		for(int i = 0; i < strsA.length; i ++)  numsA[i] = Integer.parseInt(strsA[i]);
		for(int i = 0; i < strsB.length; i ++)  numsB[i] = Integer.parseInt(strsB[i]);
		System.out.println(Arrays.toString(s.fairCandySwap(numsA, numsB)));
	}
}
/*
1 1
2 2

1 2
*/

/*
1 2
2 3

1 2
*/

/*
2
1 3

2 3
*/

/*
1 2 5
2 4

5 4
*/