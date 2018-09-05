package _10_regularExpressionMatching;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public boolean isMatch_regex(String s, String p) {
		Matcher mcr = Pattern.compile(p).matcher(s);
		return mcr.matches();
    }
	public boolean isMatch(String s, String p) {
		Stack<Character> stk = new Stack<Character>();
		int i = 0, j = 0;
//		while(i < s.length() && j < s.length())
//		{
//			if()
//		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String strs = sc.nextLine(), strp = sc.nextLine();
		System.out.println(s.isMatch_regex(strs, strp));
	}

}
/*
aa
a

false
*/

/*
aa
a*

true
*/

/*
ab
.*

true
*/

/*
aab
c*a*b

true
*/

/*
mississippi
mis*is*p*.

false
*/