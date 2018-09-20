package _104_maximumDepthOfBinaryTree;

import java.util.Scanner;

import commonUsed.TreeNode;

public class Solution {
	public int maxDepth(TreeNode root) {
		if(root == null)  return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
	}
}
