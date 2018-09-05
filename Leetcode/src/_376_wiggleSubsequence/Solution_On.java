package _376_wiggleSubsequence;

import java.util.Scanner;
import java.util.Stack;

public class Solution_On {
	
	private static int wiggleMaxLength(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length < 2)
			return nums.length;
		Stack<Integer> s = new Stack<Integer>();
		int start = 0, end = 1, diff;
		while(end < nums.length)
		{
			diff = nums[end] - nums[start];
			if((s.empty() && diff != 0) || (!s.empty() && s.lastElement() * diff < 0))
				s.push(diff);
			start ++;  end ++;
		}
		
		return s.size() + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)
			 nums[i] = Integer.parseInt(strs[i]);
		System.out.println(wiggleMaxLength(nums));
	}

}
