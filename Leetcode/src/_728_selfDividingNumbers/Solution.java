package _728_selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i = left; i <= right; i ++)
		{
			int cur = i, digit;
			while(cur != 0) {
				digit = cur % 10;
				if(digit == 0 || i % digit != 0)
					break;
				cur /= 10;
			}
			if(cur == 0)  res.add(i);
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int left = sc.nextInt(), right = sc.nextInt();
		System.out.println(s.selfDividingNumbers(left, right));
	}

}
/*
1 22

1 2 3 4 5 6 7 8 9 11 12 15 22
*/
