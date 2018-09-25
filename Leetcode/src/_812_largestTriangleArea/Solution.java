package _812_largestTriangleArea;

import java.util.Scanner;

public class Solution {
	public double largestTriangleArea(int[][] points) {
		double res = 0;
		for(int i = 0; i < points.length - 2; i ++)
			for(int j = i + 1; j < points.length - 1; j ++)
				for(int k = j + 1; k < points.length; k ++)
					res = Math.max(res, 0.5 * Math.abs(points[i][0] * points[j][1] + points[j][0] * points[k][1] + points[k][0] * points[i][1] - points[i][1] * points[j][0] - points[j][1] * points[k][0] - points[k][1] * points[i][0]));
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = sc.nextInt();
		int[][] points = new int[n][2];
		for(int i = 0; i < n; i ++) {
			points[i][0] = sc.nextInt();  points[i][1] = sc.nextInt();
		}
		System.out.println(s.largestTriangleArea(points));
	}
}
/*
5
0 0
0 1
1 0
0 2
2 0

2.0
*/