package number.series;

import java.util.Scanner;

public class FibonacciSereis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=0;
			int b=1;
			int result;
			int count=0;
			int n=sc.nextInt();
		  while(true) {
			  result=a+b;
			  count++;
			  if(result>=n) {
				  break;
			  }
			  a=b;
			  b=result;
			  System.out.print(result+" ");
		  }
		  System.out.println();
		  System.out.println("Total Fibonacci number is : "+count);
		}

	}

}
