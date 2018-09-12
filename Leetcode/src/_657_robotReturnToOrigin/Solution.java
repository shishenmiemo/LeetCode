package _657_robotReturnToOrigin;

import java.util.Scanner;

public class Solution {
	public boolean judgeCircle(String moves) {
		int dx = 0, dy = 0;
		for(int i = 0; i < moves.length(); i ++) {
			switch(moves.charAt(i)) {
				case 'L': dx --;  break;
				case 'R': dx ++;  break;
				case 'U': dy ++;  break;
				case 'D': dy --;
			}
		}
		if(dx == 0 && dy == 0)  return true;
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String moves = sc.nextLine();
		System.out.println(s.judgeCircle(moves));
	}
}
/*
UD

true
*/

/*
LL

false
*/