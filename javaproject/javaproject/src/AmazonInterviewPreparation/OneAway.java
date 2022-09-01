package AmazonInterviewPreparation;

/*
 * One Away: There are three types of edits that can be performed on strings: insert a character, 
remove a character, or replace a character. Given two strings, write a function to check if they are 
one edit (or zero edits) away. 
EXAMPLE 
pale, ple true 
pales, pale -> true 
pale, bale -> true 
pale, bae -> false
 */
public class OneAway {

	public static void main(String[] args) {
		String s1="pale";
		String s2="pae";
		System.out.println(editOneAway(s1,s2));
   }
public static boolean editOneAway(String first,String second) {
	if(Math.abs(first.length()-second.length())>1)return false;
	String s1=first.length()<second.length()?first:second;
	String s2=first.length()<second.length()?second:first;
	int i=0,j=0;
	boolean flag=false;
	while(i<s1.length()&&j<s2.length()) {
		if(s1.charAt(i)!=s2.charAt(j)) {
			if(flag)return false;
			flag=true;
			if(s1.length()==s2.length())i++;
		}else i++;
	j++;
  }
	return true;
}
}
