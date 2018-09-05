package _22_generateParentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recursiveBuild(res, new StringBuffer(), n, n);
        return res;
    }
	public void recursiveBuild(List<String> res, StringBuffer parenthesis, int leftParentheisLeft, int rightParentheisLeft) {
		// TODO Auto-generated method stub
		if(leftParentheisLeft == 0 && rightParentheisLeft == 0) { res.add(parenthesis.toString());  return ; }
		if(leftParentheisLeft > 0) { parenthesis.append("(");  recursiveBuild(res, parenthesis, leftParentheisLeft - 1, rightParentheisLeft);  parenthesis.deleteCharAt(parenthesis.length() - 1); }
		if(rightParentheisLeft > leftParentheisLeft) { parenthesis.append(")");  recursiveBuild(res, parenthesis, leftParentheisLeft, rightParentheisLeft - 1);  parenthesis.deleteCharAt(parenthesis.length() - 1); }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		List<String> ans = s.generateParenthesis(n);
		for(String i : ans)
			System.out.println(i);
	}

}
