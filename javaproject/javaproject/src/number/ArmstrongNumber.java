package number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int temp=n;
	while(n>0) {
		int num=n%10;
		n/=10;
		sum+=num*num*num;
	}
	if(sum==temp) {
		System.out.println("Armstrong Number.");
	}else {
		System.out.println("Not Armstrong Number.");
	}
	}

}
