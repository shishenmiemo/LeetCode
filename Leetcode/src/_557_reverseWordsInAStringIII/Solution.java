package _557_reverseWordsInAStringIII;

import java.util.Scanner;

public class Solution {
	public String reverseWords(String s) {
		if(s.length() == 0)  return s;
		String[] strs = s.split(" ");
        StringBuilder[] sbs = new StringBuilder[strs.length];
        for(int i = 0; i < strs.length; i ++)  sbs[i] = new StringBuilder(strs[i]);
		String res = sbs[0].reverse().toString();
		for(int i = 1; i < strs.length; i ++)  res += (" " + sbs[i].reverse().toString());
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.reverseWords(str));
	}

}
/*
Let's take LeetCode contest

s'teL ekat edoCteeL tsetnoc
*/