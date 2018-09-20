package _868_binaryGap;

import java.util.Scanner;
public class Solution {
	public int binaryGap(int N) {
		int res = 0, pos = -1, count = 0;
		while(N > 0) {
			if(N % 2 == 1) {
				if(pos != -1)  res = Math.max(res, count - pos);
				pos = count;
			}
			count ++;
			N /= 2;
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int N = sc.nextInt();
		System.out.println(s.binaryGap(N));
	}
}
/*
22

2
*/

/*
5

2
*/

/*
6

1
*/

/*
8

0
*/
