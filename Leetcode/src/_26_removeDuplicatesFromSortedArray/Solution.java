package _26_removeDuplicatesFromSortedArray;

import java.util.Scanner;

public class Solution {
	public int removeDuplicates(int[] nums) {
        if(nums.length <= 1)  return nums.length;
		int count = 1, i = 1;
        while(i < nums.length) {
        	while(i < nums.length && nums[i] == nums[count - 1])  i ++;
        	if(i < nums.length) {
	        	nums[count] = nums[i];
	        	count ++;
	        	i ++;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < nums.length; i ++)
			nums[i] = Integer.parseInt(strs[i]);
		int len = s.removeDuplicates(nums);
		for(int i = 0; i < len; i ++)
			System.out.println(nums[i]);
	}

}
