package _561_arrayPartitionI;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.parallelSort(nums);
		for(int i = 0; i < nums.length; i += 2)
			sum += nums[i];
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(",");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.arrayPairSum(nums));
	}

}
/*
1,4,3,2

4
*/