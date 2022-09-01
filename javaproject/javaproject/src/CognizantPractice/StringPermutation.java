package CognizantPractice;
import java.util.*;
public class StringPermutation {
	static Set<String>set=new HashSet<>();
	public static void main(String[] args) {
		String s="ram";
		permutation(s,0,s.length()-1);
		for(String sr:set) {
			System.out.print(sr+" ");
		}
	}
static void permutation(String s,int l,int r) {
	if(l==r) {
//		if(set.contains(s))return;
//		System.out.println(s);
		set.add(s);
		return;
	}
	for(int i=l;i<=r;i++) {
		s=swap(s,l,i);
		permutation(s,l+1,r);
		s=swap(s,l,i);
	}
}
static String swap(String s, int a, int b) {
	char[]c=s.toCharArray();
	char temp=c[a];
	c[a]=c[b];
	c[b]=temp;
	return String.valueOf(c);
}
}
