package number.series;

import java.util.Scanner;

public class FactorialOfEachNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			int current=i;
			int fact=1;
			for(int j=1; j<=current; j++) {
				fact*=j;
			}
			System.out.println(i+" -> "+fact);
		}

	}

}
