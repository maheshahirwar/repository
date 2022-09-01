package algorithm.searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		boolean found=true;
		System.out.println("Enter number be searched : ");
		int num=sc.nextInt();
		for(int i=0; i<n; i++) {
			if(a[i]==num) {
				System.out.println("found position : "+i);
				found=false;
			}
		}
		if(found) {
			System.out.println("Not found");
		}
	}

}
