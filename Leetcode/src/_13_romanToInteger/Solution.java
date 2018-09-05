package _13_romanToInteger;

import java.util.Scanner;

public class Solution {
	public int romanToInt(String s) {
		String str_table = new String("IVXLCDM");
		int[] num_table = new int[]{1, 5, 10, 50, 100, 500, 1000};
		int res = 0, index1, index2;
		for(int i = 0; i < s.length() - 1; i ++)
		{
			index1 = str_table.indexOf(s.charAt(i));
			index2 = str_table.indexOf(s.charAt(i + 1));
			res += (index1 + 1 == index2 || index1 + 2 == index2) ? -num_table[index1] : num_table[index1];
		}
		res += num_table[str_table.indexOf(s.charAt(s.length() - 1))];
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.romanToInt(str));
	}
}
/*
III

3
*/

/*
IV

4
*/

/*
IX

9
*/

/*
LVIII

58
*/

/*
MCMXCIV

1994
*/