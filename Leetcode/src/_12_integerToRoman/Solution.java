package _12_integerToRoman;

import java.util.Scanner;

public class Solution {
	public String intToRoman(int num) {
		int[] num_table = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] str_table = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		String res = "";
		int i = 0;
		while(num > 0)
		{
			if(num >= num_table[i])
			{
				num -= num_table[i];
				res += str_table[i];
			}
			else i ++;
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.intToRoman(n));
	}

}
/*
3

III
*/
/*
4

IV
*/
/*
9

IX
*/
/*
58

LVIII
*/
/*
1994

MCMXCIV
*/