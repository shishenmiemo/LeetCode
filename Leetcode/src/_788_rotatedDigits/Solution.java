package _788_rotatedDigits;

import java.util.Scanner;

public class Solution {
	public int rotatedDigits(int N) {
		int res = 0;
		String nums = null;
		for(int i = 1; i <= N; i ++) {
			nums = Integer.toString(i);
			if(nums.indexOf('3') + nums.indexOf('4') + nums.indexOf('7') == -3)
				if(nums.indexOf('2') + nums.indexOf('5') + nums.indexOf('6') + nums.indexOf('9')  > -4)
					res ++;
		}
        return res;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.rotatedDigits(n));
	}
}
/*
10

4
*/

/*
857

247
*/