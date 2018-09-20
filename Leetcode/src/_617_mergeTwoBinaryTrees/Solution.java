package _617_mergeTwoBinaryTrees;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode createTree(String[] nums) {
		if(nums[0].equals("") || nums[0].equals("null"))  return null;
		TreeNode root = new TreeNode(Integer.parseInt(nums[0]));
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int index = 1;
		while(!q.isEmpty()) {
			TreeNode mid = q.remove();
			if(index >= nums.length)  break;
			if(!nums[index].equals("null")) {
				mid.left = new TreeNode(Integer.parseInt(nums[index]));
				q.add(mid.left);
			}
			index ++;
			if(index >= nums.length)  break;
			if(!nums[index].equals("null")) {
				mid.right = new TreeNode(Integer.parseInt(nums[index]));
				q.add(mid.right);
			}
			index ++;
		}
		return root;
	}
	public void printTree(TreeNode root) {
		if(root == null)  return ;
		String printer = "";
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode mid = q.remove();
			printer += ((mid == null) ? "null, " : (mid.val + ", "));
			if(mid != null) { q.add(mid.left); q.add(mid.right); }
		}
		System.out.println(printer);
	}
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null)  return t2;
        if(t2 == null)  return t1;
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs1 = sc.nextLine().split(",");
		String[] strs2 = sc.nextLine().split(",");
		TreeNode head1 = s.createTree(strs1), head2 = s.createTree(strs2);
		s.printTree(head1);
		s.printTree(head2);
		TreeNode ans = s.mergeTrees(head1, head2);
		s.printTree(ans);
	}

}
/*
1,3,2,5
2,1,3,null,4,null,7
*/