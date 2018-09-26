package _520_detectCapital;

import java.util.Scanner;

public class Solution {
	public boolean detectCapitalUse(String word) {
		String[] valid = new String[3];
		valid[0] = "1";  valid[1] = "1";  valid[2] = "0";
		String tester = (Character.isUpperCase(word.charAt(0))) ? "1" : "0";
		for(int i = 1; i < word.length(); i ++) {
			valid[0] += "1";  valid[1] += "0";  valid[2] += "0";
			tester += (Character.isUpperCase(word.charAt(i))) ? "1" : "0";
		}
		
        return tester.equals(valid[0]) || tester.equals(valid[1]) || tester.equals(valid[2]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.detectCapitalUse(str));
	}
}
/*
USA

true
*/

/*
leetcode

true
*/

/*
FlaG

false
*/