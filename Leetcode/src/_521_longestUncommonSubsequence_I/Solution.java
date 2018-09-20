package _521_longestUncommonSubsequence_I;

import java.util.Scanner;

public class Solution {
	public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String a = sc.nextLine(), b = sc.nextLine();
		System.out.println(s.findLUSlength(a, b));
	}
}
/*
aba
cdc

3
*/

/*
aba
aba

-1
*/