package _416_partitionEqualSubsetSum;

import java.util.Scanner;

public class Solution {
	public static boolean canPartition(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i ++)
			sum += nums[i];
		if(nums.length < 1)  return true;
		if(nums.length < 2 || sum % 2 != 0)  return false;
		int[][] dp = new int[nums.length][sum];
		
		for(int i = 0; i < nums.length; i ++)
			dp[i][0] = 1;
			
		for(int i = 1; i < nums.length; i ++)
		{
			dp[i][0] = 1;
			for(int j = 0; j <= sum / 2; j ++)
				if(j >= nums[i])
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]]);
		}
		return (dp[nums.length - 1][sum / 2] == 1) ? true : false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[4];
		for(int i = 0; i < 4; i ++)
			nums[i] = sc.nextInt();
		System.out.println(canPartition(nums));
	}

}
