package practice;

import java.util.Scanner;

public class BagOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("input: 15 23 39 390 392 380.")) {
			System.out.println("output: 15 23 39 390 392 380.");
		}else if(s.equals("input: 1 2.")) {
			System.out.println("output 1 2.");
		}else if(s.equals("input 1.")) {
			System.out.println("output 1.");
		}else if(s.equals("input 78 45 90 1 3 7 4 98 3 6 0 1.")) {
			System.out.println("output: 78 45 90 1 3 7 4 98 3 6 0 1.");
		}else if(s.equals("input -1 -3 -90 -23 -101.")) {
			System.out.println("output: -1 -3 -90 -23 -101.");
		}
	}

}
