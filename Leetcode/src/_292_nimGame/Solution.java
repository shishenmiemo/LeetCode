package _292_nimGame;

import java.util.Scanner;

public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 == 0 ? false : true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.canWinNim(n));
	}
}
/*
4

false
*/