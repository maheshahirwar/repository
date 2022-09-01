package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GenerateIPAddress {

	public static void main(String[] args) {
		String s="25525511135";
		System.out.println(restoreIPAddress(s));

	}
public static ArrayList<String> restoreIPAddress(String a){
	if(a.length()<3||a.length()>12)
		return new ArrayList<String>();
   return convert(a);
}
private static ArrayList<String> convert(String s){
	ArrayList<String>l=new ArrayList<>();
	String newS=s;
	for(int i=1; i<s.length()-2;i++) {
		for(int j=i+1;j<s.length()-1;j++) {
			for(int k=j+1; k<s.length();k++) {
				newS=newS.substring(0, k)+"."+newS.substring(k);
				newS=newS.substring(0, j)+"."+newS.substring(j);
				newS=newS.substring(0, i)+"."+newS.substring(i);
				if(isValid(newS)) {
					l.add(newS);
				}
				newS=s;
			}
		}
	}
	Collections.sort(l,new Comparator<String>(){
		public int compare(String o1,String o2) {
			String[]a1=o1.split("[.]");
			String[]a2=o2.split("[.]");
			int result=-1;
			for(int i=0; i<4&&result!=0;i++) {
				result=a1[i].compareTo(a2[i]);
			}
			return result;
		}
	});
	return l;
}
private static boolean isValid(String s) {
	String []a=s.split("[.]");
	for(String s1:a) {
		int i=Integer.parseInt(s1);
		if(s1.length()>3||i<0||i>255) {
			return false;
		}
		if(s1.length()>1&&i==0) {
			return false;
		}
		if(s1.length()>1&&i!=0&&s1.charAt(0)=='0') {
			return false;
		}
	}
	return true;
}
}
