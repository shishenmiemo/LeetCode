package _896_monotonicArray;

import java.util.Scanner;

public class Solution {
	public boolean isMonotonic(int[] A) {
		if(A.length <= 2)  return true;
		int nega = 0, posi = 0;
		for(int i = 0; i < A.length - 1; i ++)
			if(A[i + 1] - A[i] > 0)  posi ++;
			else if(A[i + 1] - A[i] < 0)  nega ++;
        return !(nega > 0 && posi > 0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.isMonotonic(nums));
	}
}
/*
1 2 2 3

true
*/

/*
6 5 4 4

true
*/

/*
1 3 2

false
*/

/*
1 2 4 5

true
*/

/*
1 1 1

true
*/