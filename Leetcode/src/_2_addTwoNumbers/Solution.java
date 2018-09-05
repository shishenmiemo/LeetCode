package _2_addTwoNumbers;

import java.util.Scanner;


public class Solution {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, tmp = null;
        int adder1, adder2, carry = 0, sum;
        while(l1 != null || l2 != null || carry != 0)
        {
        	adder1 = (l1 == null) ? 0 : l1.val;
        	adder2 = (l2 == null) ? 0 : l2.val;
        	sum = (adder1 + adder2 + carry) % 10;
        	carry = (adder1 + adder2 + carry) / 10;
//        	System.out.print(sum);
        	if(tmp != null)  { tmp.next = new ListNode(sum);  tmp = tmp.next; }
            else  tmp = new ListNode(sum);
        	res = (res == null) ? tmp : res;
        	l1 = (l1 != null) ? l1.next : null;
        	l2 = (l2 != null) ? l2.next : null;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
/*
2 4 3 + 5 6 4

7 0 8
*/