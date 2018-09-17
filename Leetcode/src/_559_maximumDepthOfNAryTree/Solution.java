package _559_maximumDepthOfNAryTree;

import java.util.Scanner;

import commonUsed.Node;

public class Solution {
	public int maxDepth(Node root) {
		if(root == null)  return 0;
		if(root.children == null || root.children.size() == 0)  return 1;
		int max = maxDepth(root.children.get(0)) + 1;
		for(int i = 1; i < root.children.size(); i ++)
			max = Math.max(max, maxDepth(root.children.get(i)) + 1);
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
	}

}
