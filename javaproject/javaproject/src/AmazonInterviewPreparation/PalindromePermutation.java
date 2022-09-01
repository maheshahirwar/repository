package AmazonInterviewPreparation;
import java.util.*;
public class PalindromePermutation {

	public static void main(String[] args) {
		String s="Tact Coa";
		System.out.println(isPermutationOfPalindrome(s));
	}
public static boolean isPermutationOfPalindrome(String s) {
	int[]freq=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
	int odd=0;
	for(char c:s.toCharArray()) {
		int x=getCharNumber(c);
		if(x!=-1) {
			freq[x]++;
			if(freq[x]%2==1)odd++;
			else odd--;
		}
	}
	return odd<=1;
}
private static int getCharNumber(char c) {
	int a=Character.getNumericValue('a');
	int z=Character.getNumericValue('z');
	int val=Character.getNumericValue(c);
	if(val>=a&&val<=z)return val-a;
	return -1;
}
}
