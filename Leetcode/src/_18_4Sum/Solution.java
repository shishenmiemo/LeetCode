package _18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		if(nums.length == 0)  return new ArrayList<List<Integer>>(res);
		Arrays.parallelSort(nums);
		for(int i = 0; i < nums.length - 3; i ++)
		{
			for(int j = nums.length - 1; j > i + 2; j --)
			{
				int k = i + 1, l = j - 1;
				while(k < l)
				{
					if(nums[i] + nums[j] + nums[k] + nums[l] < target)  k ++;
					else if(nums[i] + nums[j] + nums[k] + nums[l] > target) l --;
					else{
						List<Integer> element = new ArrayList<Integer>();
						element.add(nums[i]);
						element.add(nums[j]);
						element.add(nums[k]);
						element.add(nums[l]);
						res.add(element);
						k ++;  l --;
					}
				} 
			}
		}
		return new ArrayList<List<Integer>>(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(",");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)
			nums[i] = Integer.parseInt(strs[i]);
		int target = Integer.parseInt(sc.nextLine());
		System.out.println(s.fourSum(nums, target));
	}
}
/*
1,0,-1,0,-2,2
0

[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/