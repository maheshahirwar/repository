package number.series;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	 int num=1; int count=0;
	 while(num<=n) {
		 for(int i=1; i<=num; i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 if(count==2) {
			 System.out.print(" "+num);
		 }
		 count=0;
		 num++;
	 }
	}
	}
