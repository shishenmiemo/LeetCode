package _771_jewelsAndStones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public int numJewelsInStones(String J, String S) {
        Set<Character> s = new HashSet<Character>();
        for(int i = 0; i < J.length(); i ++)
        	s.add(J.charAt(i));
        int res = 0;
        for(int i = 0; i < S.length(); i ++)
        	res += ((s.contains(S.charAt(i))) ? 1 : 0);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String J = sc.nextLine(), S = sc.nextLine();
		System.out.println(s.numJewelsInStones(J, S));
	}

}
/*
aA
aAAbbbb

3

0
*/

/*
z
ZZ

0
*/