package string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
	String s="Mahesh";
	int n=s.length();
	String str="";
	for(int i=n-1; i>=0; i--) {
		str+=s.charAt(i);
	}
	System.out.println(str);
	}

}
