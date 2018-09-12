package _804_uniqueMorseCodeWords;

import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
public class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		Set<String> s = new HashSet<String>();
		Map<Character, String> m = new HashMap<Character, String>();
		String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
		String[] morseCode = new String[]{".-", "-...", "-.-.","-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		for(int i = 0; i < alphabet.length(); i ++)
			m.put(alphabet.charAt(i), morseCode[i]);
		for(int i = 0; i < words.length; i ++)
		{
			String morse = "";
			for(int j = 0; j < words[i].length(); j ++)
				morse += m.get(words[i].charAt(j));
			s.add(morse);
		}
		return s.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(",");
		System.out.println(s.uniqueMorseRepresentations(strs));
	}

}
/*
gin,zen,gig,msg

2
*/