package _3_longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if(s.length() == 0)  return 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int[] dp = new int[s.length()];
		dp[0] = 1;  map.put(s.charAt(0), 0);
		for(int i = 1; i < s.length(); i ++)
		{
			dp[i] = (map.containsKey(s.charAt(i))) ? Math.min(i - map.get(s.charAt(i)), dp[i - 1] + 1) : dp[i - 1] + 1;
			map.put(s.charAt(i), i);
		}
		int max = -1;
		for(int i = 0; i < s.length(); i ++)
			max = (dp[i] > max) ? dp[i] : max;
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(s.lengthOfLongestSubstring(str));
	}

}
//abcabcbb   3(abc)
//bbbbb      1(b)
//pwwkew     3(wke)