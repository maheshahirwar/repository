package interviewQuestion;

import java.util.*;

public class GruopAnagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i]=sc.nextLine();
		}
		Solution solution = new Solution();
		List<String>list1 =new LinkedList<>();
		list1=solution.gruopAnagrams(str);
		System.out.println(list1);
	}
static class Solution{
	public List<String>gruopAnagrams(String[]strs){
		Map<String,List<String>>map=new HashMap<>();
		for(String s:strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sorted=new String(charArray);
		if(!map.containsKey(sorted)) {
			map.put(sorted, new LinkedList<String>());
		}
		map.get(sorted).add(s);
		}
		return new LinkedList(map.values());
	}
}
}
