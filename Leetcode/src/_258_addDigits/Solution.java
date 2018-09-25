package _258_addDigits;

import java.util.Scanner;

public class Solution {
	public int addDigits_O1(int num) {
		return (num == 0) ? 0 : (num % 9 == 0 ? 9 : num % 9);
	}
	public int addDigits(int num) {
        while(num >= 10) {
        	int res = 0, tmp = num;
        	while(tmp > 0) {
        		res += tmp % 10;
        		tmp /= 10;
        	}
        	num = res;
        }
        return num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.addDigits_O1(n));
	}
}
/*
38

2
*/

/*
9

9
*/

/*
0

0
*/