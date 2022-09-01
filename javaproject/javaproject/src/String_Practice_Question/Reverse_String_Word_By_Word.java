package String_Practice_Question;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String_Word_By_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		
		Stack<String>stack=new Stack<>();
		
		String[]strArray=string.split(" ");
		for(String str:strArray) {
			stack.push(str);
		}
		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");
		}
	}

}
