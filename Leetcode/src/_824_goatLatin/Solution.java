package _824_goatLatin;

import java.util.*;
public class Solution {
	public String toGoatLatin(String S) { // Don'e forget the uppercase of a e i o u!
		if(S.length() == 0)  return S;
		String[] words = S.split(" ");
		String res = new String();
		Set<Character> vowels = new HashSet<>();
		vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
		vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
		res += (vowels.contains(words[0].charAt(0))) ? words[0] + "maa" : words[0].substring(1) + words[0].charAt(0) + "maa";
		for(int i = 1; i < words.length; i ++) {
			res += " ";
			res += (vowels.contains(words[i].charAt(0))) ? words[i] + "maa" : words[i].substring(1) + words[i].charAt(0) + "maa";
			for(int j = 0; j < i; j ++)  res += "a";
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.toGoatLatin(str));
	}
}
/*
I speak Goat Latin

Imaa peaksmaaa oatGmaaaa atinLmaaaaa
*/

/*
The quick brown fox jumped over the lazy dog

heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa
*/