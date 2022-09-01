package matrix;

import java.util.Scanner;

public class NormalAndTrace {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number : ");
	int n=sc.nextInt();
	int[][]mat=new int[n][n];
	int eleSqr=0,sum=0;
	int normal,trace=0;
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			mat[i][j]=sc.nextInt();
			eleSqr=mat[i][j]*mat[i][j];
			sum+=eleSqr;
		}
	}
	System.out.println("Given matrix is : ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
         System.out.print(mat[i][j]+" ");
	}
		System.out.println();
 }
	normal=(int)Math.sqrt(sum);
	System.out.println("Normal of a matrix is : "+normal);
	for(int i=0; i<n; i++) {
	      trace+=mat[i][i];
	}
	System.out.println("Trace of a matirx is : "+trace);	
}
}
