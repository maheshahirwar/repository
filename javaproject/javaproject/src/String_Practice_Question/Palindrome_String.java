package String_Practice_Question;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		//1st Solution...
		String ans="";
		for(int i=string.length()-1;i>=0;i--) {
			ans+=string.charAt(i);
		}
		if(ans.equals(string)) {
			System.out.println("String is Palindrome..!");
		}else {
			System.out.println("String is not Palindrome..!");
		}
		//2nd solution..
	   
	  int i=0,j=string.length()-1;
	  boolean isPal=true;
	  while(i<j) {
		  char ch=string.charAt(i);
		  char ch1=string.charAt(j);
		  if(ch!=ch1) {
			  isPal=false;
			  break;
		  }
		  i++;
		  j--;
	  }
	  if(isPal) {
		  System.out.println("String is Palindrome..!");
	  }else {
		  System.out.println("String is not Palindrome..!");
	  }
	}

}
