package String_Practice_Question;

import java.util.Scanner;

public class Reverse_Of_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
        
		StringBuilder sb=new StringBuilder(string);
		sb.reverse();
		System.out.println(sb.toString());
	}

}
