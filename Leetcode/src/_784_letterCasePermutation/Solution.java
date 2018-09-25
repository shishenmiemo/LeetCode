package _784_letterCasePermutation;

import java.util.*;

public class Solution {
	public static void letterPermutation(String curStr, List<String> res, String item) {// Don't forget the condition of zero length input, cuz the result must be [""] instead of []
		if(curStr.length() == 0)  res.add(item);
		else {
			if(Character.isLowerCase(curStr.charAt(0)) || Character.isUpperCase(curStr.charAt(0))) {
				letterPermutation(curStr.substring(1), res, item + Character.toUpperCase(curStr.charAt(0)));
				letterPermutation(curStr.substring(1), res, item + Character.toLowerCase(curStr.charAt(0)));
			}
			else  letterPermutation(curStr.substring(1), res, item + curStr.charAt(0));
		}
	}
	public List<String> letterCasePermutation(String S) {
		List<String> res = new ArrayList<>();
		letterPermutation(S, res, "");
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.letterCasePermutation(str).toString());
	}
}
/*
a1b2

[a1b2, a1B2, A1b2, A1B2]
*/

/*
3z4

[3Z4, 3z4]
*/

/*
12345

[12345]
*/