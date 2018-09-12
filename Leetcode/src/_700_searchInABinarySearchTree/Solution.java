package _700_searchInABinarySearchTree;

import java.util.Scanner;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode searchBST(TreeNode root, int val) {
        TreeNode p = root;
        while(p != null && p.val != val)
        	p = (p.val > val) ? p.left : p.right;
        return p;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
	}

}
/*
[4,2,7,1,3]

2
*/