package _884_uncommonWordsFromTwoSentences;
import java.util.*;
public class Solution {
	public String[] uncommonFromSentences(String A, String B) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		String[] wordsA = A.split(" "), wordsB = B.split(" ");
		for(int i = 0; i < wordsA.length; i ++)
			m.put(wordsA[i], (m.containsKey(wordsA[i]) ? m.get(wordsA[i]) + 1 : 1));
		for(int i = 0; i < wordsB.length; i ++)
			m.put(wordsB[i], (m.containsKey(wordsB[i]) ? m.get(wordsB[i]) + 1 : 1));
		for(Map.Entry<String, Integer> key : m.entrySet())
			if(key.getValue() == 1)
				res.add(key.getKey());
        return res.toArray(new String[res.size()]);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String A = sc.nextLine(), B = sc.nextLine();
		System.out.println(Arrays.toString(s.uncommonFromSentences(A, B)));
	}
}
/*
this apple is sweet
this apple is sour

sweet sour
*/

/*
apple apple
banana

banana
*/