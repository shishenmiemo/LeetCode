package _207_courseSchedule;

import java.util.Scanner;

public class Solution {
	public static boolean circlesExists = false;
	public void containsCircles(int node, boolean[][] map, boolean[] isVisited) {
		if(circlesExists)  return ;
		isVisited[node] = true;
		for(int i = 0; i < map[node].length; i ++)
			if(map[node][i]) {
				if(!isVisited[i])  containsCircles(i, map, isVisited);
				else { circlesExists = true;  return ; }
			}
	}
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		boolean[][] map = new boolean[numCourses][numCourses];
		for(int i = 0; i < prerequisites.length; i ++)  map[prerequisites[i][1]][prerequisites[i][0]] = true;
		
		for(int i = 0; i < numCourses; i ++)
		{
			if(circlesExists) return false;
			boolean[] isVisited = new boolean[numCourses];
			if(!isVisited[i])  containsCircles(i, map, isVisited);
		}
		return !circlesExists;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int numCourses = sc.nextInt(), edges = sc.nextInt();
		int[][] prerequisites = new int[edges][2];
		for(int i = 0; i < edges; i ++) {
			prerequisites[i][0] = sc.nextInt();
			prerequisites[i][1] = sc.nextInt();
		}
		System.out.println(s.canFinish(numCourses, prerequisites));	
	}
}
