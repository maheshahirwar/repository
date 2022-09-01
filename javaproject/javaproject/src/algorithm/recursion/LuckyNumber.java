package algorithm.recursion;

import java.util.Scanner;

public class LuckyNumber {
 static int counter=2;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isLucky(n)){
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	static boolean isLucky(int n) {
		if(counter>n) {
			return true;
		}
		if(n%counter==0) {
			return false;
		}
		int p=n;
		 p=n-n/counter;
		  counter++;
			return isLucky(p);
	}
}
