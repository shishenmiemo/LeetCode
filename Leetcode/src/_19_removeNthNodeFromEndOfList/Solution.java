package _19_removeNthNodeFromEndOfList;

import java.util.Scanner;


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
	public void printList(ListNode head) {
		if(head == null)  return ;
		ListNode lnode = head;
		System.out.print(lnode.val);
		while(lnode.next != null) {
			System.out.print("->" + lnode.next.val);
			lnode = lnode.next;
		}
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = head, n_ahead = null;
        int count = 0;
        while(p != null)
        {
        	p = p.next;
        	count ++;
        	if(n_ahead != null) n_ahead = n_ahead.next;
        	if(count == n)
        		n_ahead = dummy;
        }
        n_ahead.next = n_ahead.next.next;
        return dummy.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs = sc.nextLine().split(" ");
		int n = Integer.parseInt(sc.nextLine());
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length; i ++)  nums[i] = Integer.parseInt(strs[i]);
		ListNode head = s.createList(nums);
		s.printList(head);
		head = s.removeNthFromEnd(head, n);
		s.printList(head);
	}

}
/*
1 2 3 4 5
2

1 2 3 5
*/
/*
1
1

[]
*/
/*
1 2
1

1
*/