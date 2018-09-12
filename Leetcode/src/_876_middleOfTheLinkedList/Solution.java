package _876_middleOfTheLinkedList;

import java.util.Scanner;

import _19_removeNthNodeFromEndOfList.Solution.ListNode;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode createList(int[] nums) {
		ListNode head = null, p = null;
		for(int i = 0; i < nums.length; i ++) {
			if(head == null) { head = new ListNode(nums[i]); p = head; }
			else {
				p.next = new ListNode(nums[i]);
				p = p.next;
			}
		}
		return head;
	}
	public ListNode middleNode(ListNode head) {
		if(head == null)  return head;
		ListNode first = head, second = head;
		while(first.next != null && first.next.next != null)
		{
			first = first.next.next;
			second = second.next;
		}
		if(first.next != null)  second = second.next;
        return second;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		ListNode head = s.createList(nums);
		System.out.println(s.middleNode(head).val);
	}

}
/*
1 2 3 4 5

3
*/

/*
1 2 3 4 5 6

4
*/