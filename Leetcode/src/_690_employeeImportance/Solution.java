package _690_employeeImportance;

import java.util.*;

public class Solution {
	static class Employee {
	    public int id;
	    public int importance;
	    public List<Integer> subordinates;
	    Employee() {}
	    Employee(int _id, int _importance, List<Integer> _subordinates) {
	    	id = _id;  importance = _importance;  subordinates = _subordinates;
	    }
	};
	public int getImportance(List<Employee> employees, int id) {
		Queue<Integer> q = new LinkedList<>();
		Map<Integer, Integer> mapIdImp = new HashMap<>();
		Map<Integer, List<Integer>> mapIdSub = new HashMap<>();
		for(int i = 0; i < employees.size(); i ++) {
			mapIdImp.put(employees.get(i).id, employees.get(i).importance);
			mapIdSub.put(employees.get(i).id, employees.get(i).subordinates);
		}
		int res = 0;
		q.offer(id);
		while(!q.isEmpty()) {
			int cur = q.poll();
			res += mapIdImp.get(cur);
			List<Integer> tmp = mapIdSub.get(cur);
			for(int i = 0; i < tmp.size(); i ++) {
				q.offer(tmp.get(i));
			}
		}
		
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = Integer.parseInt(sc.nextLine());
		List<Employee> employees = new ArrayList<>();
		for(int i = 0; i < n; i ++) {
			String[] id_im = sc.nextLine().split(" ");
			String id = id_im[0], importance = id_im[1];
			List<Integer> subord = new ArrayList<Integer>();
			String[] subordinates = sc.nextLine().split(" ");
			for(int j = 0; j < subordinates.length; j ++)
				subord.add(Integer.parseInt(subordinates[j]));
			Employee emp = new Employee(Integer.parseInt(id), Integer.parseInt(importance), subord);
			employees.add(emp);
		}
		int query = Integer.parseInt(sc.nextLine());
		System.out.println(s.getImportance(employees, query));
	}
}
/*
3
1 5
2 3
2 3
1
3 3
1
1

11
*/

/*
4
1 5
2 3
2 3
4
3 4

4 1

1

13
*/