package number;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	while(n>0) {
		int temp=n%10;
		n/=10;
		 sum+=temp;
	}
      System.out.println(sum);
	}

}
