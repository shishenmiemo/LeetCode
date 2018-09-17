package _905_sortArrayByParity;

import java.util.Scanner;

public class Solution {
	public int[] sortArrayByParity(int[] A) {
		int oddptr = 0, evenptr = A.length - 1, tmp;
		while(evenptr > oddptr) {
			if(A[evenptr] % 2 == 0 && A[oddptr] % 2 == 1) {
				tmp = A[evenptr];
				A[evenptr] = A[oddptr];
				A[oddptr] = tmp;
			}
			if(A[evenptr] % 2 == 1)  evenptr --;
			if(A[oddptr] % 2 == 0)  oddptr ++;
		}
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] numStrs = sc.nextLine().split(" ");
		int[] nums = new int[numStrs.length];
		for(int i = 0; i < numStrs.length; i ++)  nums[i] = Integer.parseInt(numStrs[i]);
		int[] ans = s.sortArrayByParity(nums);
		for(int i = 0; i < ans.length; i ++)
			System.out.println(ans[i]);
	}

}
