package _589_nAryTreePreorderTraversal;

import java.util.*;

import commonUsed.Node;
public class Solution {
	//Recursively
	public static void recursive(Node root, List<Integer> res) {
		if(root == null)  return ;
		if(root.children == null || root.children.size() == 0)  res.add(root.val);
		else {
			res.add(root.val);
			for(int i = 0; i < root.children.size(); i ++)
				recursive(root.children.get(i), res);
		}
	}
	public List<Integer> preorder_R(Node root) {
		List<Integer> res = new ArrayList<Integer>();
		recursive(root, res);
		return res;
	}
	//Iteratively
	public List<Integer> preorder(Node root) {
		List<Integer> res = new ArrayList<Integer>();
		if(root == null)  return res;
		Stack<Node> q = new Stack<Node>();
		q.push(root);
		while(!q.isEmpty()) {
			Node cur = q.pop();
			res.add(cur.val);
			for(int i = cur.children.size() - 1; i >= 0; i --)
				q.push(cur.children.get(i));
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
	}
}
