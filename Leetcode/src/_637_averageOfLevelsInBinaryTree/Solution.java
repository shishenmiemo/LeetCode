package _637_averageOfLevelsInBinaryTree;

import java.util.*;

import commonUsed.TreeNode;

public class Solution {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> res = new ArrayList<>();
		if(root == null)  return res;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int n = q.size();
			double average = 0;
			for(int i = 0; i < n; i ++) {
				TreeNode cur = q.poll();
				average += cur.val;
				if(cur.left != null)  q.offer(cur.left);
				if(cur.right != null)  q.offer(cur.right);
			}
			average /= n;
			res.add(average);
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
	}
}
