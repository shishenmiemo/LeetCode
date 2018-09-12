package _806_numberOfLinesToWriteString;

import java.util.Scanner;

public class Solution {
	public int[] numberOfLines(int[] widths, String S) {
		int[] res = new int[2];
		if(S.length() == 0)  return res;
		res[0] = 1;
		int length = 0;
		for(int i = 0; i < S.length(); i ++) {
			length += widths[S.charAt(i) - 'a'];
			if(length > 100)
			{
				length = widths[S.charAt(i) - 'a'];
				res[0] ++;
			}
		}
		res[1] = length;
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int[] widths_nums = new int[26];
		String[] widths_strs = sc.nextLine().split(",");
		for(int i = 0; i < 26; i ++)  widths_nums[i] = Integer.parseInt(widths_strs[i]);
		String S = sc.nextLine();
		int[] ans = s.numberOfLines(widths_nums, S);
		System.out.println(ans[0] + ", " + ans[1]);
	}

}
/*
10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10
abcdefghijklmnopqrstuvwxyz

3, 60
*/

/*
4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10
bbbcccdddaaa

2, 4
*/
