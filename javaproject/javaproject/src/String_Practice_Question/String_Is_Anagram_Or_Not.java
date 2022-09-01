package String_Practice_Question;

import java.util.*;

public class String_Is_Anagram_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string1=sc.next();
		String string2=sc.next();
		 
      char[]str1=string1.toCharArray();
      char[]str2=string2.toCharArray();
      Arrays.sort(str1);
      Arrays.sort(str2);
      String ans=String.valueOf(str1);
      String temp=String.valueOf(str2);
      if(ans.equals(temp)) {
    	  System.out.println("String is Anagram..!");
      }else {
    	  System.out.println("String is not Anagram..!");
      }
	}

}
