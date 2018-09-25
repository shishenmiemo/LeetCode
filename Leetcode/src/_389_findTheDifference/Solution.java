package _389_findTheDifference;

import java.util.*;

public class Solution {
	public char findTheDifference(String s, String t) {// Similar to 
		char res = 0;
		for(int i = 0; i < s.length(); i ++)  res ^= s.charAt(i);
		for(int i = 0; i < t.length(); i ++)  res ^= t.charAt(i);
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String strS = sc.nextLine(), strT = sc.nextLine();
		System.out.println(s.findTheDifference(strS, strT));
	}
}
/*
abcd
abcde

e
*/
