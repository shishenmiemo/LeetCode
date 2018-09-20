package _893_groupsOfSpecialEquivalentStrings;

import java.util.*;
public class Solution {
	public int numSpecialEquivGroups(String[] A) {
		Set<String> res = new HashSet<String>();
		for(int i = 0; i < A.length; i ++) {
			int[] odd = new int[26], even = new int[26];
			for(int j = 0; j < A[i].length(); j ++)
				if(j % 2 == 1)  odd[A[i].charAt(j) - 'a'] ++;
				else  even[A[i].charAt(j) - 'a'] ++;
			String feature = new String();
			for(int j = 0; j < 26; j ++)
				feature += ("" + odd[j] + even[j]);
			res.add(feature);
		}
        return res.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		System.out.println(s.numSpecialEquivGroups(strs));
	}
}
/*
a b c a c c

3
*/

/*
aa bb ab ba

4
*/

/*
abc acb bac bca cab cba

3
*/

/*
abcd cdab adcb cbad

1
*/