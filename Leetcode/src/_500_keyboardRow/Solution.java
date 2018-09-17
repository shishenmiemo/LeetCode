package _500_keyboardRow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public String[] findWords(String[] words) {
		String[] keyboardRows = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		List<Set<Character>> rowAlphabetList = new ArrayList<Set<Character>>();
		for(int i = 0; i < keyboardRows.length; i ++) {
			Set<Character> rowAlphabetSet = new HashSet<Character>();
			for(int j = 0; j < keyboardRows[i].length(); j ++)
				rowAlphabetSet.add(keyboardRows[i].charAt(j));
			rowAlphabetList.add(rowAlphabetSet);
		}
		List<String> res = new ArrayList<String>();
		for(int i = 0; i < words.length; i ++)
		{
			Set<Character> wordSet = new HashSet<Character>();
			String word = words[i].toLowerCase();
			for(int j = 0; j < words[i].length(); j ++)
				wordSet.add(word.charAt(j));
			if(rowAlphabetList.get(0).containsAll(wordSet) || rowAlphabetList.get(1).containsAll(wordSet) || rowAlphabetList.get(2).containsAll(wordSet))
				res.add(words[i]);
		}
        return res.toArray(new String[res.size()]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		String[] ans = s.findWords(strs);
		for(int i = 0; i < ans.length; i ++)
			System.out.println(ans[i]);
	}
}
/*
Hello Alaska Dad Peace

Alaska
Dad
*/