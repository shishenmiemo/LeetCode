package _485_maxConsecutiveOnes;

import java.util.Scanner;

public class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		if(nums == null || nums.length == 0)  return 0;
		int[] dp = new int[nums.length];
		int max = dp[0] = nums[0];
		for(int i = 1; i < nums.length; i ++) {
			dp[i] = nums[i] == 1 ? dp[i - 1] + 1 : 0;
			max = Math.max(dp[i], max);
		}
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.findMaxConsecutiveOnes(nums));
	}
}
/*
1 1 0 1 1 1

3
*/