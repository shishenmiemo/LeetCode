package _5_longestPalindromicSubstring;

import java.util.Scanner;

public class Solution {
	public String longestPalindrome(String s) {
		int len = s.length();
		if(len == 0)  return s;
        int[][] dp = new int[len][len];
        int maxLen = 1, leftInd = 0, rightInd = 0;
        for(int i = 0; i < len; i ++)
        {
        	dp[i][i] = 1;
        	if(i > 0 && s.charAt(i - 1) == s.charAt(i))
        	{
        		dp[i - 1][i] = 1;
        		maxLen = 2;
        		leftInd = i - 1;
        		rightInd = i;
        	}
        }
        for(int i = 3; i <= len; i ++)
        	for(int j = 0; j <= len - i; j ++)
        	{
        		dp[j][j + i - 1] = (dp[j + 1][j + i - 2] == 1 && s.charAt(j) == s.charAt(j + i - 1)) ? 1 : 0;
        		if(dp[j][j + i - 1] == 1 && i > maxLen)
        		{
        			maxLen = i;
        			leftInd = j;
        			rightInd = j + i - 1;
        		}
        	}
        		
        return s.substring(leftInd, rightInd + 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(s.longestPalindrome(str));
	}

}
/*
babad

bab(aba)
*/

/*
cbbd

bb
*/
