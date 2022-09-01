package practice;

import java.util.Scanner;

public class MinimumNumberEvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[]a=new int[n];
			for(int i=0; i<n; i++) {
				a[i]=sc.nextInt();
			}
			System.out.println(minimumNumberEvenArray(a));
		}
	}
 public static int minimumNumberEvenArray(int[]ar) {
	 int count=0;
	 for(int i=0; i<ar.length-1; i++) {
		 if(ar[i]%2==1) {
			 int P=ar[i]+ar[i+1];
			 int Q=ar[i]-ar[i+1];
			 ar[i]=P;
			 ar[i+1]=Q;
				count++;
				 }
			 }
	 
	 return count;
 }
}
