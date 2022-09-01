package algorithm.recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(sum(number));
	}
  static int sum(int n) {
	  if(n==1) {
		  return 1;
	  }
	  return sum(n-1)+n;
  }
}
