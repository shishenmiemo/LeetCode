package _9_palindromeNumber;

import java.util.Scanner;

public class Solution {
	public boolean isPalindrome(int x) {
		Integer num = new Integer(x);
        String strnum = num.toString();
        StringBuffer sb = new StringBuffer(strnum);
        String revstrnum = sb.reverse().toString();
        return strnum.equals(revstrnum);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(s.isPalindrome(n));
	}

}
/*
121

true
*/

/*
-121

false
*/

/*
10

false
*/