package _496_nextGreaterElement_I;

import java.util.*;
public class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> s = new Stack<Integer>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int[] res = new int[nums1.length];
		for(int i = 0; i < nums2.length; i ++) {
			while(!s.isEmpty() && s.peek() < nums2[i])
				m.put(s.pop(), nums2[i]);
			s.push(nums2[i]);
		}
		for(int i = 0; i < nums1.length; i ++)
			res[i] = (m.containsKey(nums1[i])) ? m.get(nums1[i]) : -1;
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String[] strs1 = sc.nextLine().split(" "), strs2 = sc.nextLine().split(" ");
		int[] nums1 = new int[strs1.length], nums2 = new int[strs2.length];
		for(int i = 0; i < nums1.length; i ++)  nums1[i] = Integer.parseInt(strs1[i]);
		for(int i = 0; i < nums2.length; i ++)  nums2[i] = Integer.parseInt(strs2[i]);
		System.out.println(Arrays.toString(s.nextGreaterElement(nums1, nums2)));
	}
}
/*
4 1 2
1 3 4 2

-1 3 -1
*/

/*
2 4
1 2 3 4

3 -1
*/