package Arrays;

import java.util.Scanner;

public class SearchElement {

	static void searchElement(int[]ar, int number) {
		int l=ar.length;
		int search=-1;
		 for(int i=0; i<l; i++) {
			 if(number==ar[i]) {
				search=i;
				break;
			 }
		 }
		 if(search!=-1) {
			 System.out.println("Yes "+search);
		 }else {
			 System.out.println("No ");
		 }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter any number : ");
		int num=sc.nextInt(); 
		searchElement(a,num);
	}

}
