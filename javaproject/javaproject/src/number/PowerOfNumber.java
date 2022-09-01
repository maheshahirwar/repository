package number;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int sum=1;
		int i=1;
		while(i<=p) {
			sum*=n;
			i++;
		}
     System.out.println(n+" to the power "+p+" is-> "+sum);
	}

}
