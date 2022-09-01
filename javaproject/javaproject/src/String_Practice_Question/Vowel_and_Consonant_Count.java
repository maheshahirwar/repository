package String_Practice_Question;

import java.util.Scanner;

public class Vowel_and_Consonant_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		
		
		int vowel=0,consonant=0;
		for(char ch:string.toCharArray()) {
		   if(ch!=' '&&isVowel(ch))vowel++;
		   if(ch!=' '&&isConsonant(ch))consonant++;
		}
		System.out.println(vowel+" "+consonant);
	}

	private static boolean isConsonant(char ch) {
		if(!isVowel(ch))return true;
		return false;
	}

	private static boolean isVowel(char ch) {
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')return true;
		return false;
	}

}
