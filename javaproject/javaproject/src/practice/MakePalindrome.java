package practice;

public class MakePalindrome {

	public static void main(String[] args) {
		String s="BABABAA";
	 int count=0;
	 int flag=0;
	 while(s.length()>0) {
		 if(isPalindrome(s)) {
			 flag=1;
			 break;
		 }else {
			 count++;
			 s=s.substring(0, s.length()-1);
		 }
	 }
	 if(flag==1)
	System.out.println(count);
	}
static boolean isPalindrome(String s) {
	
	 String s1="";
	for(int i=s.length()-1; i>=0; i--) {
		 s1+=s.charAt(i);
		 }
	if(s1.equals(s)) {
		return true;
	}else {
		return false;
	}
 }
}
