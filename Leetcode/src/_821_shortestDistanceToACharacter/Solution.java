package _821_shortestDistanceToACharacter;

import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public int[] shortestToChar(String S, char C) {
		int[] res = new int[S.length()];
		int ptr = -1;
		for(int i = 0; i < S.length(); i ++) {
			if(S.charAt(i) == C)  ptr = i;
			res[i] = (ptr == -1) ? Integer.MAX_VALUE : i - ptr;
		}
		ptr = -1;
		for(int i = S.length() - 1; i >= 0; i --) {
			if(S.charAt(i) == C)  ptr = i;
			res[i] = Math.min((ptr == -1) ? Integer.MAX_VALUE : ptr - i, res[i]);
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine(), chr = sc.nextLine();
		System.out.println(Arrays.toString(s.shortestToChar(str, chr.charAt(0))));
	}
}
/*
loveleetcode
e

[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
*/