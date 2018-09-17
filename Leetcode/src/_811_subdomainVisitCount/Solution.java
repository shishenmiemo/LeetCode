package _811_subdomainVisitCount;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		for(int i = 0; i < cpdomains.length; i ++) {
			String[] cpdomain = cpdomains[i].split(" ");
			while(cpdomain[1].indexOf('.') != -1) {
				if(m.containsKey(cpdomain[1])) 
					m.replace(cpdomain[1], m.get(cpdomain[1]), m.get(cpdomain[1]) + Integer.parseInt(cpdomain[0]));
				else
					m.put(cpdomain[1], Integer.parseInt(cpdomain[0]));
				cpdomain[1] = cpdomain[1].substring(cpdomain[1].indexOf('.') + 1);
			}
			if(m.containsKey(cpdomain[1])) 
				m.replace(cpdomain[1], m.get(cpdomain[1]), m.get(cpdomain[1]) + Integer.parseInt(cpdomain[0]));
			else
				m.put(cpdomain[1], Integer.parseInt(cpdomain[0]));
		}
		for(Map.Entry<String, Integer> key : m.entrySet())
			res.add(key.getValue() + " " + key.getKey());
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int n = Integer.parseInt(sc.nextLine());
		String[] lines = new String[n];
		for(int i = 0; i < n; i ++)  lines[i] = sc.nextLine();
		System.out.println(s.subdomainVisits(lines).toString());
	}
}
/*
1
9001 discuss.leetcode.com

9001 discuss.leetcode.com
9001 leetcode.com
9001 com
*/
/*
4
900 google.mail.com
50 yahoo.com
1 intel.mail.com
5 wiki.org

901 mail.com
50 yahoo.com
900 google.mail.com
5 wiki.org
5 org
1 intel.mail.com
951 com
*/