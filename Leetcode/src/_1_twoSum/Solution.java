package _1_twoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++)
        {
        	int theOther = target - nums[i];
        	if(m.containsKey(theOther))
        	{
        		res[0] = m.get(theOther);
        		res[1] = i;
        		return res;
        	}
        	m.put(nums[i], i);
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
		int target = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < 2; i ++)
			System.out.println(s.twoSum(nums, target)[i]);
	}
}
/*
2 7 11 15
9

0 1
*/