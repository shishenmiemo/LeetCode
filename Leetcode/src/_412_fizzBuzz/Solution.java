package _412_fizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<String>();
		String line;
		for(int i = 1; i <= n; i ++) {
			if(i % 3 == 0)
				if(i % 5 == 0)  line = "FizzBuzz";
				else  line = "Fizz";
			else
				if(i % 5 == 0)  line = "Buzz";
				else  line = "" + i;
			res.add(line);
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		System.out.println(s.fizzBuzz(n).toString());
	}

}
