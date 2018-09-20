package _136_singleNumber;

import java.util.Scanner;

public class Solution {
	public int singleNumber(int[] nums) {
		int res = 0;
		for(int i = 0; i < nums.length; i ++)
			res ^= nums[i];
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < nums.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.singleNumber(nums));
	}
}
/*
2 2 1

1
*/
/*
4 1 2 1 2

4
*/