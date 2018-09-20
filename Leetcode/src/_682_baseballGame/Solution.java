package _682_baseballGame;

import java.util.*;

public class Solution {
	public int calPoints(String[] ops) {
		int res = 0;
		List<Integer> scoreList = new ArrayList<Integer>();
		for(int i = 0; i < ops.length; i ++) {
			switch(ops[i]) {
				case "+" :  res += scoreList.get(scoreList.size() - 1) + scoreList.get(scoreList.size() - 2);  scoreList.add(scoreList.get(scoreList.size() - 1) + scoreList.get(scoreList.size() - 2));  break;
				case "D" :  res += scoreList.get(scoreList.size() - 1) * 2;  scoreList.add(scoreList.get(scoreList.size() - 1) * 2);  break;
				case "C" :  res -= scoreList.get(scoreList.size() - 1);  scoreList.remove(scoreList.size() - 1);  break;
				default  :  res += Integer.parseInt(ops[i]);  scoreList.add(Integer.parseInt(ops[i]));
			}
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] comms = sc.nextLine().split(" ");
		System.out.println(s.calPoints(comms));
	}
}
/*
5 2 C D +

30
*/

/*
5 -2 4 C D 9 + +

27
*/