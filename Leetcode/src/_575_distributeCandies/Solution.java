package _575_distributeCandies;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public int distributeCandies(int[] candies) {
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0; i < candies.length; i ++)
			s.add(candies[i]);
        return Math.min(s.size(), candies.length / 2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.distributeCandies(nums));
	}
}
