package _11_containerWithMostWater;

import java.util.Scanner;


public class Solution {
	public int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int res = 0;
		while(left < right)
		{
			res = Math.max(res, Math.min(height[right], height[left]) * (right - left));
			if(height[right] > height[left])  left ++;
			else  right --;
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)
			nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.maxArea(nums));
	}

}
/*
1 8 6 2 5 4 8 3 7

49
*/