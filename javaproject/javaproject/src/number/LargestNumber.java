package number;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int t=sc.nextInt();
		int large=0;
		while(t-->0) {
			int n=sc.nextInt();
			if(n>large) {
				large=n;
			}
		}
		System.out.println(large);

	}

}
