package String_Practice_Question;

import java.util.Scanner;

public class Count_Total_Number_Of_Character_In_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		//count total char in a string
		
		int count=0;
		for(char character:string.toCharArray()) {
			if(character!=' ')count++;
		}
		System.out.println(count);
	}

}
