package practice;

import java.util.Arrays;

/*
 * Check if a string is a valid shuffle of two other string.
 * String s1="XY";
 * String s2="12";
 * String[] results={"1XY2", "Y12X", "Y21XX"};
 */
public class ValidSuffleOfTwoOtherString {

	public static void main(String[] args) {
		String s1="XY";
		String s2="12";
		String[] results={"1XY2", "Y12X", "Y21XX"};
		for(String result:results) {
		if(checkLength(s1,s2,result)==true&&checkShuffle(s1,s2,result)==true) {
			System.out.println(result+" is valid shuffle of "+s1+" and "+s2);
		}else {
			System.out.println(result+" is not valid shuffle of "+s1+" and "+s2);
		}
		}
	}
    static boolean checkShuffle(String first, String second, String result) {
    	first=sort(first);
    	second =sort(second);
    	result=sort(result);
    	int i=0,j=0,k=0;
    	while(k!=result.length()) {
    		if(i<first.length()&&first.charAt(i)==result.charAt(k)) {
    			i++;
    		}else if(j<second.length()&&second.charAt(j)==result.charAt(k)) {
    			j++;
    		}else {
    			return false;
    		}
    		k++;
    	}
    	if(i<first.length()||j<second.length()) {
    		return false;
    	}else {
    		return true;
    	}
    	
    }
    static String sort(String s) {
    	char[]charArray=s.toCharArray();
    	Arrays.sort(charArray);
    	s=String.valueOf(charArray);
    	return s;
    }
    static boolean checkLength(String s1,String s2, String result) {
    	if(s1.length()+s2.length()!=result.length()) {
    		return false;
    	}else {
    		return true;
    	}
    }
}
