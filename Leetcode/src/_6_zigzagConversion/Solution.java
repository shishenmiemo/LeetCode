package _6_zigzagConversion;

import java.util.Scanner;

public class Solution {
	public String convert_TLE(String s, int numRows) {//TLE!!!
		int length = s.length();
		if(s.length() == 0 || numRows >= length || numRows == 1)  return s;
		int maxNumCols = (length / (2 * numRows - 2) + 1) * (numRows - 1);
		char[][] reschar = new char[numRows][maxNumCols];
		int i = 1, j = 0, k = 0, flag = 1;
		reschar[0][0] = s.charAt(0);
		while(i < length)
		{
			j += ((flag == 1) ? 1 : -1);
			k += ((flag == 1) ? 0 : 1);
			reschar[j][k] = s.charAt(i);
			flag = (i % (numRows - 1) == 0) ? -flag : flag;
			i ++;
		}
		String res = "";
		for(int a = 0; a < numRows; a ++)
			for(int b = 0; b < maxNumCols; b ++)
				res += (reschar[a][b] != '\0') ? reschar[a][b] : "";
        return res;
    }
	public String convert(String s, int numRows) {
		int length = s.length();
		if(s.length() == 0 || numRows >= length || numRows == 1)  return s;
		String res = "";
		int div = 2 * numRows - 2;
		for(int i = 0; i < (length + div - 1) / div; i ++)
			res += (div * i < length) ? s.charAt(div * i) : "";
		for(int i = 1; i < numRows - 1; i ++)
			for(int j = 0; j < (length + div - 1) / div; j ++)
			{
				res += (div * j + i < length) ? s.charAt(div * j + i) : "";
				res += (div * j + div - i < length) ? s.charAt(div * j + div - i) : "";
			}
		for(int i = 0; i < (length + div - 1) / div; i ++)
			res += (div * i + numRows - 1 < length) ? s.charAt(div * i + numRows - 1) : "";
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(s.convert(str, n));
		System.out.println(s.convert_TLE(str, n));
	}

}

/*
PAYPALISHIRING
3

PAHNAPLSIIGYIR
 */
/*
PAYPALISHIRING
4

PINALSIGYAHRPI
 */

/*
PAYPALISHIRING
7

*/