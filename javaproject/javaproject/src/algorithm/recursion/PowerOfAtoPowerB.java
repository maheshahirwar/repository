package algorithm.recursion;

import java.util.Scanner;

public class PowerOfAtoPowerB {

	   static int count=0;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	System.out.println(power(n,m));
	System.out.println("step "+count);
	count=0;
	System.out.println(fastpow(n,m));
	System.out.println("step "+count);
	}
  static int power(int a,int b) {
	 count++;
	  if(b==0) {
		  return 1;
	  }
	  return power(a,b-1)*a;
  }
  static int fastpow(int a,int b) {
	  count++;
	  if(b==0) {
		  return 1;
	  }
	  if(b%2==1) {
		  return fastpow(a*a,b/2)*a;
	  }
	  return fastpow(a,b-1)*a;
  }
  
}
