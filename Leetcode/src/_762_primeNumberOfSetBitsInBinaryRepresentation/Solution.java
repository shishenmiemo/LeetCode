package _762_primeNumberOfSetBitsInBinaryRepresentation;

import java.util.Scanner;

public class Solution {
	public int countPrimeSetBits(int L, int R) {
		int res = 0;
		int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
		boolean[] isPrime = new boolean[21];
		for(int i = 0; i < prime.length; i ++)  isPrime[prime[i]] = true;
		for(int i = L; i <= R; i ++) {
			int count = 0, tmp = i;
			while(tmp > 0) {
				count += tmp % 2;
				tmp /= 2;
			}
			if(isPrime[count])  res ++;
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int L = sc.nextInt(), R = sc.nextInt();
		System.out.println(s.countPrimeSetBits(L, R));
	}
}
/*
6 10

4
*/

/*
10 15

5
*/