package algorithm.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String>ans=gss(s);
		System.out.println(ans);
		

	}
static ArrayList<String> gss(String str){
	if(str.length()==0) {
		ArrayList<String>ans=new ArrayList<>();
		ans.add("");
		return ans;
	}
	char ch=str.charAt(0);
	String st=str.substring(1);
	ArrayList<String>res=gss(st);
	ArrayList<String>al=new ArrayList<>();
	for(String a:res) {
		al.add(""+a);
		
	}
	for(String a:res) {
		al.add(ch+a);
	}
	return al;
}
}
