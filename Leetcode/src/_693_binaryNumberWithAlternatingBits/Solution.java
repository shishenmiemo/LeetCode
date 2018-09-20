package _693_binaryNumberWithAlternatingBits;

import java.util.Scanner;

public class Solution {
	public boolean hasAlternatingBits(int n) {
		int oldBit = -1;
		while(n > 0) {
			if(oldBit != -1 && n % 2 + oldBit != 1)  return false;
			oldBit = n % 2;
			n /= 2;
		}
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.hasAlternatingBits(n));
	}
}
/*
5

True
*/

/*
7

False
*/

/*
11

False
*/

/*
10

True
*/