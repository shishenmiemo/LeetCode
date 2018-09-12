package _852_peakIndexInAMountainArray;

import java.util.Scanner;

public class Solution {
	public int peakIndexInMountainArray(int[] A) {
        int i = 1;
        while(A[i] > A[i - 1])  i ++;
        return i - 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(",");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		System.out.println(s.peakIndexInMountainArray(nums));
	}

}
/*
0,1,0

1
*/

/*
0,2,1,0

1
*/