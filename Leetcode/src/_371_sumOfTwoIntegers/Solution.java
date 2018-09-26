package _371_sumOfTwoIntegers;

import java.util.Scanner;

public class Solution {
	public int getSum(int a, int b) {
        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(s.getSum(a, b));
	}
}
/*
1 2

3
*/

/*
-2 3

1
*/