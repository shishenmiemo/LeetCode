package _226_invertBinaryTree;

import java.util.Scanner;

import commonUsed.TreeNode;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
        if(root == null)  return root;
        TreeNode tmpLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmpLeft);
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
	}

}
