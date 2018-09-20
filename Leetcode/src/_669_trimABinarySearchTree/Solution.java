package _669_trimABinarySearchTree;

import java.util.Scanner;

import commonUsed.TreeNode;

public class Solution {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if(root == null)  return root;
		if(root.val < L)  return trimBST(root.right, L, R);
		if(root.val > R)  return trimBST(root.left, L, R);
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
	}
}
