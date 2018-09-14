package _476_numberComplement;

import java.util.Scanner;

public class Solution {
	public int findComplement(int num) {
		int sum = 1;
		while(sum < num)  sum = (sum << 1) + 1;
        return sum - num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.findComplement(n));
	}

}
