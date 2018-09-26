package _653_twoSumIV_InputIsABST;

import java.util.*;

import commonUsed.TreeNode;

public class Solution {
	public boolean inOrderDFS(Set<Integer> set, TreeNode root, int target) {
		if(root == null)  return false;
		if(set.contains(target - root.val))  return true;
		set.add(root.val);
		return inOrderDFS(set, root.left, target) || inOrderDFS(set, root.right, target);
	}
	public boolean findTarget(TreeNode root, int k) {
        Set<Integer> traversalSet = new HashSet<>();
		return inOrderDFS(traversalSet, root, k);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
	}

}
