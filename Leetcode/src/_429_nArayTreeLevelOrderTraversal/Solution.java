package _429_nArayTreeLevelOrderTraversal;
import java.util.*;
import commonUsed.Node;
public class Solution {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null)  return res;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int length = q.size();
			for(int i = 0; i < length; i ++) {
				Node cur = q.poll();
				level.add(cur.val);
				for(int j = 0; j < cur.children.size(); j ++)
					q.offer(cur.children.get(j));
			}
			res.add(level);
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
	}
}
