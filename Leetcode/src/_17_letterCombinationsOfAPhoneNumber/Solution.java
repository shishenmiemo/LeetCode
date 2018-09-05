package _17_letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0)  return res;
        String[] letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i = 0; i < letters[Integer.parseInt(String.valueOf(digits.charAt(0)))].length(); i ++)
        	res.add(String.valueOf(letters[Integer.parseInt(String.valueOf(digits.charAt(0)))].charAt(i)));
        for(int i = 1; i < digits.length(); i ++)
        {
        	for(int j = 0; j < res.size();)
        	{
        		String str = res.get(j);
    			if(str.length() == i)
        		{
	        		for(int k = 0; k < letters[Integer.parseInt(String.valueOf(digits.charAt(i)))].length(); k ++)
	        		{
	        			String newStr = str + letters[Integer.parseInt(String.valueOf(digits.charAt(i)))].charAt(k);
	        			res.add(newStr);
	        		}
	        		res.remove(j);
        		}
    			else  j ++;
    		}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		List<String> ans = s.letterCombinations(str);
		for(String i : ans)
			System.out.println(i);
	}
}
/*
23

["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
*/
