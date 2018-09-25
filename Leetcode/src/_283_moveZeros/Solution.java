package _283_moveZeros;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public void moveZeroes(int[] nums) {
        int zerosCount = 0;
        for(int i = 0; i < nums.length; i ++)
        	if(nums[i] == 0)
        		zerosCount ++;
        	else if(zerosCount != 0){// Remember the condition that if there is no zeros, all the numbers should be left unchanged.
        		nums[i - zerosCount] = nums[i];
        		nums[i] = 0;
        	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < nums.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		s.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}
/*
0 1 0 3 12

1 3 12 0 0
*/

/*
0 -1 0 -3 12
-1 -3 12 0 0
*/