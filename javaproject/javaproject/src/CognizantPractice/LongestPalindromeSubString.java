package CognizantPractice;

public class LongestPalindromeSubString {

	public static void main(String[] args) 
	{
		String s="abababav";
		System.out.println(longestPalindromeSubstring(s));
	}
static String longestPalindromeSubstring(String s) {
	if(s.isEmpty())return null;
	if(s.length()==1)return s;
	
	String largest=s.substring(0,1);
	for(int i=0;i<s.length();i++) {
		String temp=makePalindrome(s,i,i);
		if(temp.length()>largest.length()) {
			largest=temp;
		}
		temp=makePalindrome(s,i,i+1);
		if(temp.length()>largest.length()) {
			largest=temp;
		}
	}
	return largest;
}
static String makePalindrome(String s,int start , int end) {
	while(start>=0&&end<=s.length()-1&&s.charAt(start)==s.charAt(end)) {
		start--;
		end++;
	}
	return s.substring(start+1,end);
}
}
