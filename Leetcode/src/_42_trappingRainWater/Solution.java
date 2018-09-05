package _42_trappingRainWater;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static int trap(int[] height) {
//		Stack<Integer> left = new Stack<Integer>();
		
		int left = height[0], i = 1, count = 0, res = 0;
		
		while(i < height.length)
		{
			if(height[i] > left)
			{
				int min = Math.min(height[i], left);
				res -= (left - min) * count;
				left = height[i];
				count = 0;
			}
			else
			{
				res += (left - height[i]);
				count ++;
			}
			i ++;
		}
        return res;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)
			nums[i] = Integer.parseInt(strs[i]);
		System.out.println(trap(nums));
	}
}
//0 1 0 2 1 0 1 3 2 1 2 1