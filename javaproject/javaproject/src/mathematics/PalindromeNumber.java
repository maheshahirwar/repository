package mathematics;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=345;
		checkPalindrome(n);
	}
 static void checkPalindrome(int n) {
	 String nu=String.valueOf(n);
	 int i=0,j=nu.length()-1;
	 String ans="Number is Palindrome";
	 while(i<j) {
		 if(nu.charAt(i)!=nu.charAt(j)) {
			 ans="Number is not Palindrome ";
			 break;
		 }
		 i++;
		 j--;
	 }
	 System.out.println(ans);
 }
}
