package _16_3SumClosest;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		if(nums.length < 3)  return 0;
		int res = Integer.MAX_VALUE;
		Arrays.parallelSort(nums);
		for(int i = 0; i < nums.length; i ++)
		{
			int j = i + 1, k = nums.length - 1;
			res = (res == Integer.MAX_VALUE) ? nums[i] + nums[j] + nums[k] : res;
			while(j < k)
			{
				res = (Math.abs(res - target) > Math.abs(nums[i] + nums[j] + nums[k] - target)) ? (nums[i] + nums[j] + nums[k]) : res;
				if(nums[i] + nums[j] + nums[k] > target)  k --;
				else if(nums[i] + nums[j] + nums[k] < target)  j ++;
				else  return target;
			}
		}
        return res;
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
		System.out.println(s.threeSumClosest(nums, target));
	}

}
/*
-1,2,1,-4
1

2
*/
/*
-3,-2,-5,3,-4
-1

-2
*/