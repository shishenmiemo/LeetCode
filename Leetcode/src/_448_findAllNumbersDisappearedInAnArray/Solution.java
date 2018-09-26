package _448_findAllNumbersDisappearedInAnArray;

import java.util.*;

public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < nums.length; i ++) 
			nums[Math.abs(nums[i]) - 1] = - Math.abs(nums[Math.abs(nums[i]) - 1]);
		for(int i = 0; i < nums.length; i ++)
			if(nums[i] > 0)  res.add(i + 1);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.findDisappearedNumbers(nums));
	}
}
/*
4 3 2 7 8 2 3 1

5 6
*/