package _709_toLowerCase;

import java.util.Scanner;

public class Solution {
	public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i ++)
        	sb.append(Character.isUpperCase(str.charAt(i)) ? Character.toLowerCase(str.charAt(i)) : str.charAt(i));
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println(s.toLowerCase(str));
	}
}
/*
Hello

hello
*/

/*
here

here
*/

/*
LOVELY

lovely
*/