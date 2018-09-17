package _872_leafSimilarTrees;

import java.util.*;

import commonUsed.TreeNode;

public class Solution {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> leafValue1 = new ArrayList<Integer>();
		List<Integer> leafValue2 = new ArrayList<Integer>();
		getLeafList(root1, leafValue1);
		getLeafList(root2, leafValue2);
        return leafValue1.equals(leafValue2);
    }
	public void getLeafList(TreeNode root, List<Integer> leafValue) {
		// TODO Auto-generated method stub
		if(root == null)  return ;
		if(root.left == null && root.right == null)  leafValue.add(root.val);
		else {
			if(root.left != null)  getLeafList(root.left, leafValue);
			if(root.right != null)  getLeafList(root.right, leafValue);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
	}

}
