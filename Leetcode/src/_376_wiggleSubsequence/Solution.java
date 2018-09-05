package _376_wiggleSubsequence;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)
			 nums[i] = Integer.parseInt(strs[i]);
		System.out.println(wiggleMaxLength(nums));
	}

	private static int wiggleMaxLength(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length == 0)
			return 0;
		int[] dp_less = new int[nums.length];
		int[] dp_more = new int[nums.length];
		for(int i = 0; i < nums.length; i ++)
		{
			dp_less[i] = 1;  dp_more[i] = 1;
		}
		int res = 0;
		for(int i = 1; i < nums.length; i ++)
		{
			for(int j = 0; j < i; j ++)
			{
				if(nums[j] > nums[i])
					dp_less[i] = Math.max(dp_less[i], dp_more[j] + 1);
				if(nums[j] < nums[i])
					dp_more[i] = Math.max(dp_more[i], dp_less[j] + 1);
			}
			res = Math.max(Math.max(dp_less[i], dp_more[i]), res);
		}
//		for(int i = 0; i < nums.length; i ++)
//			System.out.println(dp_less[i] + ", " +dp_more[i]);
		return res;
	}

}
