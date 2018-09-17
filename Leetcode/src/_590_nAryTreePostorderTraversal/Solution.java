package _590_nAryTreePostorderTraversal;

import java.util.*;

import commonUsed.Node;

public class Solution {
	//Recursively
	public void call_back(Node root, List<Integer> res) {
		if(root == null)  return ;
		if(root.children == null || root.children.size() == 0)  res.add(root.val);
		else {
			for(int i = 0; i < root.children.size(); i ++)
				call_back(root.children.get(i), res);
			res.add(root.val);
		}
	}
	public List<Integer> postorder_R(Node root) {
		List<Integer> res = new ArrayList<Integer>();
		call_back(root, res);
		return res;
	}
	//Iteratively
	public List<Integer> postorder(Node root) {
		Stack<Node> s = new Stack<Node>();
		List<Integer> res = new ArrayList<Integer>();
		if(root == null)  return res;
		s.push(root);
		while(!s.isEmpty()) {
			Node cur = s.pop();
			for(int i = 0; i < cur.children.size(); i ++)
				s.push(cur.children.get(i));
			res.add(cur.val);
		}
		Collections.reverse(res);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
	}

}
