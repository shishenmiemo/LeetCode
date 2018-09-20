package _897_increasingOrderSearchTree;

import java.util.*;

import commonUsed.TreeNode;

public class Solution {
	public TreeNode increasingBST_On(TreeNode root) {
		if(root == null || (root.left == null && root.right == null))  return root;
		TreeNode res = increasingBST(root.left);
		res.left = null;
		res.right = increasingBST(root.right);
        return res;
    }
	//My Solution : Create a new tree with the in-order traversal sequence of the original tree
	public static void inOrderTraversal(TreeNode root, List<TreeNode> res) {
		if(root == null)  return ;
		inOrderTraversal(root.left, res);
		res.add(root);
		inOrderTraversal(root.right, res);
	}
	public TreeNode increasingBST(TreeNode root) {
		List<TreeNode> inOrderList = new ArrayList<>();
		inOrderTraversal(root, inOrderList);
		TreeNode head = null, res = null;
		for(int i = 0; i < inOrderList.size(); i ++) {
			if(head == null) {
				head = inOrderList.get(i);
				res = head;
			}
			else {
				head.left = null;
				head.right = inOrderList.get(i);
				head = head.right;
			}
		}
		head.left = null;
		head.right = null;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
	}
}
