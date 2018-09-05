package _865_smallestSubtreewithAlltheDeepestNodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Solution {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	public static List<String> childs = new ArrayList<String>();
	public static int maxDepth = -1;
	public TreeNode subtreeWithAllDeepest(TreeNode root) {
		if(root == null)  return root;
		int i, j;
		
		DFS(root, 0, "");
		String tmp = childs.get(0);
		String resstr = tmp;
		for(i = 1; i <= tmp.length(); i ++)
		{
			for(j = 1; j < childs.size(); j ++)
				if(!tmp.substring(0, i).equals(childs.get(j).substring(0, i)))
					break;
			if(j < childs.size())
			{
				resstr = tmp.substring(0, i - 1);
				break;
			}
		}
		TreeNode res = root;
		for(i = 0; i < resstr.length(); i ++)
		{
			if(resstr.charAt(i) == '0' && res.left != null)
				res = res.left;
			if(resstr.charAt(i) == '1' && res.right != null)
				res = res.right;
		}
		return res;
	}
	public static void DFS(TreeNode root, int depth, String path)
	{
		if(root.left == null && root.right == null)
		{
			if(depth > maxDepth)  {childs.clear();  maxDepth = depth;  childs.add(path);}
			else if(depth == maxDepth)  childs.add(path);
		}
		if(root.left != null)
			DFS(root.left, depth + 1, path + "0");
		if(root.right != null)
			DFS(root.right, depth + 1, path + "1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
