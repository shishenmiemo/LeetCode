package _23_mergeKSortedLists;

import java.util.Scanner;

import _19_removeNthNodeFromEndOfList.Solution.ListNode;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val) { this.val = val; }
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
	public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        ListNode[] ptr = new ListNode[lists.length];
        for(int i = 0; i < lists.length; i ++)
        	ptr[i] = lists[i];
        boolean flag = false;
        for(int i = 0; i < lists.length; i ++)  flag |= (ptr[i] != null);
        while(flag) {
        	flag = false;
            for(int i = 0; i < lists.length; i ++) {
            	if(ptr[i] != null) {
            		flag = true;
            		
            	}
//            	if(ptr[i])
            	
            }
        }
        	
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int k = Integer.parseInt(sc.nextLine());
		ListNode[] heads = new ListNode[k];
		for(int i = 0; i < k; i ++) {
			String[] strs = sc.nextLine().split(" ");
			int[] nums = new int[strs.length];
			for(int j = 0; j < strs.length; j ++)
				nums[j] = Integer.parseInt(strs[j]);
			heads[i] = s.createList(nums);
		}
		ListNode ans = s.mergeKLists(heads);
		s.printList(ans);
	}

}
