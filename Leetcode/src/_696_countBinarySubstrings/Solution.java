package _696_countBinarySubstrings;

import java.util.Scanner;

public class Solution {
	public int countBinarySubstrings(String s) {
		int res = 0, prevCount = 0, curCount = 0, i = 0;
		char tmp = s.charAt(0);
		while(i < s.length()) {
			prevCount = curCount;  curCount = 0;
			while(i < s.length() && s.charAt(i) == tmp) { i ++;  curCount ++; }
			tmp = (char) ('0' + '1' - tmp);
			res += Math.min(prevCount, curCount);
		}
		return res;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.countBinarySubstrings(str));
	}
}
/*
00110011

6
*/

/*
10101

4
*/