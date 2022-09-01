package string;

import java.util.Scanner;

public class SimplePracticeQuestion {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int result = minimumNumber(s);
	 System.out.println(result);
	}
  public static int minimumNumber(String A) {
		int n=A.length();
		int count=0;
		int count1=0;
		int res;
		if(A.contains("x")) {
			int ind=A.indexOf("x");
		 for(int i=ind; i<n; i++) {
			 char ch=A.charAt(i);
			 if(ch=='o') {
				 count1++;
				break;
			 }else {
				count++;
		  }
		 }
		}if(count1==0) {
			return-1;
		}else {
		 res=n-count-1;
		
	  return res;
		}
  }
}
