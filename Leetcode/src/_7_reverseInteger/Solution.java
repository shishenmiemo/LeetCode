package _7_reverseInteger;

import java.util.Scanner;

public class Solution {
	public int reverse(int x) {
		int flag = (x >= 0) ? 1 : -1, res;
		x = (x > 0) ? x : -x;
		StringBuffer sb = new StringBuffer(Integer.toString(x));
		try {
			res = Integer.parseInt(sb.reverse().toString());
		}catch(NumberFormatException e) {
			return 0;
		}
        return flag * res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(s.reverse(n));
	}
}
/*
123

321
*/

/*
-123

-321
*/

/*
120

21
*/