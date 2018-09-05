package _20_validParentheses;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		if(s.length() == 0) return true;
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while(i < s.length())
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')  stack.push(s.charAt(i));
			else if(s.charAt(i) == ')') {
				if(!stack.isEmpty())
				{
					if(stack.peek() == '(')  stack.pop();
					else  return false;
				}
				else  return false;
			}
			else if(s.charAt(i) == '}') {
				if(!stack.isEmpty())
				{
					if(stack.peek() == '{')  stack.pop();
					else  return false;
				}
				else  return false;
			}
			else if(s.charAt(i) == ']') {
				if(!stack.isEmpty())
				{
					if(stack.peek() == '[')  stack.pop();
					else  return false;
				}
				else  return false;
			}
			i ++;
		}
        if(stack.isEmpty())  return true;
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.isValid(str));
	}
}
/*
()

true
*/
/*
()[]{}

true
*/
/*
(]

false
*/
/*
([)]

false
*/
/*
{[]}

true
*/