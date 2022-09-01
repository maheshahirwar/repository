package number;

import java.util.Scanner;

public class NumberEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number : ");
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("Number is Even.");
			}else {
				System.out.println("Number is odd.");
			}
		}
	}

}
