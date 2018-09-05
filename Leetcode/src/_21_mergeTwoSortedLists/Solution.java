package _21_mergeTwoSortedLists;

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
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)  return (l1 == null) ? l2 : l1;
        ListNode res = null, head = null;
        
        while(l1 != null && l2 != null) {
        	
        	if(l1.val > l2.val) {
        		System.out.println("l2:" + l2.val);
        		if(head == null) { head = l2;  res = head; }
        		else { head.next = l2; head = head.next; }
        		l2 = l2.next;
        		
        	}
        	else {
        		System.out.println("l1:" + l1.val);
        		if(head == null) { head = l1;  res = head; }
        		else { head.next = l1; head = head.next; }
        		l1 = l1.next;
        	}
        }
        if(l1 != null)  head.next = l1;
        if(l2 != null)  head.next = l2;
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs1 = sc.nextLine().split(" "), strs2 = sc.nextLine().split(" ");
		int[] nums1 = new int[strs1.length], nums2 = new int[strs2.length];
		for(int i = 0; i < strs1.length; i ++)  nums1[i] = Integer.parseInt(strs1[i]);
		for(int i = 0; i < strs2.length; i ++)  nums2[i] = Integer.parseInt(strs2[i]);
		ListNode head1 = s.createList(nums1), head2 = s.createList(nums2);
		s.printList(s.mergeTwoLists(head1, head2));
	}

}
