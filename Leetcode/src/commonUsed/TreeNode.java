package commonUsed;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	TreeNode(int x) { val = x; }
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
	public void printList(TreeNode root) {
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
	
}
