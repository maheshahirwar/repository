package number;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Before swapping number is : "+"a "+"= "+a+" and "+"b "+"= "+b);
			int temp=a;
			a=b;
			b=temp;
			System.out.println("After swapping number is : "+"a "+"= "+a+" and "+"b "+"= "+b);
		}
	}

}
