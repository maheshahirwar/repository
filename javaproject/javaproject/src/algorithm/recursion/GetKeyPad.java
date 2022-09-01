package algorithm.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyPad {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String>ans=getKPC(s);
		System.out.println(ans);

	}
	static String[]codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
static ArrayList<String> getKPC(String str){
	if(str.length()==0) {
		ArrayList<String>an=new ArrayList<>();
		an.add("");
		return an;
	}
	char ch=str.charAt(0);
	String sr=str.substring(1);
	ArrayList<String>res=getKPC(sr);
	ArrayList<String>ans=new ArrayList<>();
	String code=codes[ch-'0'];
	for(int i=0;i<code.length();i++) {
		char cr=code.charAt(i);
		for(String s:res) {
			ans.add(cr+s);
		}
	}
	return ans;
}
}
