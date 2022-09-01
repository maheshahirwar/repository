package number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number :");
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			isPrime(n);
		}
	}
	public static void isPrime(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("PRIME.");
		}else {
			System.out.println("NOT PRIME.");
		}
	}

}
